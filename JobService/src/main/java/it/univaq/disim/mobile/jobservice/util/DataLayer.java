/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.univaq.disim.mobile.jobservice.util;

/**
 *
 * @author Francesca
 */
public interface DataLayer extends AutoCloseable{
    void init() throws DataLayerException;

    void destroy() throws DataLayerException;
}
