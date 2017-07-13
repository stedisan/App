/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restfuldb.service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import restfuldb.Professionista;
import restfuldb.ProfessionistaPK;

/**
 *
 * @author Teresa
 */
@javax.ejb.Stateless
@javax.ws.rs.Path("restfuldb.professionista")
public class ProfessionistaFacadeREST extends AbstractFacade<Professionista> {

    @PersistenceContext(unitName = "RESTful_WrPU")
    private EntityManager em;

    private ProfessionistaPK getPrimaryKey(javax.ws.rs.core.PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;idProf=idProfValue;idCat=idCatValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        restfuldb.ProfessionistaPK key = new restfuldb.ProfessionistaPK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> idProf = map.get("idProf");
        if (idProf != null && !idProf.isEmpty()) {
            key.setIdProf(java.lang.Character.valueOf(idProf.get(0)));
        }
        java.util.List<String> idCat = map.get("idCat");
        if (idCat != null && !idCat.isEmpty()) {
            key.setIdCat(java.lang.Character.valueOf(idCat.get(0)));
        }
        return key;
    }

    public ProfessionistaFacadeREST() {
        super(Professionista.class);
    }

    @javax.ws.rs.POST
    @Override
    @javax.ws.rs.Consumes({javax.ws.rs.core.MediaType.APPLICATION_XML, javax.ws.rs.core.MediaType.APPLICATION_JSON})
    public void create(Professionista entity) {
        super.create(entity);
    }

    @javax.ws.rs.PUT
    @javax.ws.rs.Path("{id}")
    @javax.ws.rs.Consumes({javax.ws.rs.core.MediaType.APPLICATION_XML, javax.ws.rs.core.MediaType.APPLICATION_JSON})
    public void edit(@javax.ws.rs.PathParam("id") javax.ws.rs.core.PathSegment id, Professionista entity) {
        super.edit(entity);
    }

    @javax.ws.rs.DELETE
    @javax.ws.rs.Path("{id}")
    public void remove(@javax.ws.rs.PathParam("id") javax.ws.rs.core.PathSegment id) {
        restfuldb.ProfessionistaPK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @javax.ws.rs.GET
    @javax.ws.rs.Path("{id}")
    @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_XML, javax.ws.rs.core.MediaType.APPLICATION_JSON})
    public Professionista find(@javax.ws.rs.PathParam("id") javax.ws.rs.core.PathSegment id) {
        restfuldb.ProfessionistaPK key = getPrimaryKey(id);
        return super.find(key);
    }

    @javax.ws.rs.GET
    @Override
    @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_XML, javax.ws.rs.core.MediaType.APPLICATION_JSON})
    public List<Professionista> findAll() {
        return super.findAll();
    }

    @javax.ws.rs.GET
    @javax.ws.rs.Path("{from}/{to}")
    @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_XML, javax.ws.rs.core.MediaType.APPLICATION_JSON})
    public List<Professionista> findRange(@javax.ws.rs.PathParam("from") Integer from, @javax.ws.rs.PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @javax.ws.rs.GET
    @javax.ws.rs.Path("count")
    @javax.ws.rs.Produces(javax.ws.rs.core.MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
