/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.univaq.disim.mobile.jobservice.database;

import it.univaq.disim.mobile.jobservice.util.DataLayerException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author Francesca
 */
public class DataLayerMysqlImpl {
    protected DataSource datasource;
    protected Connection connection;

    public DataLayerMysqlImpl(DataSource datasource) throws SQLException, NamingException {
        super();
        this.datasource = datasource;
        this.connection = null;
    }

    public void init() throws DataLayerException {
        try {
            //connessione al database locale
            //database connection
            connection = datasource.getConnection();
        } catch (SQLException ex) {
            throw new DataLayerException("Error initializing data layer", ex);
        }
    }

    public void destroy() {
        try {
            if (connection != null) {
                connection.close();
                connection = null;
            }
        } catch (SQLException ex) {
            
        }
    }

    public void close() throws Exception {
        destroy();
    }
}


