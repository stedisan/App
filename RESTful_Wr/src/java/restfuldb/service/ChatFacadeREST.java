/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restfuldb.service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import restfuldb.Chat;
import restfuldb.ChatPK;

/**
 *
 * @author Teresa
 */
@javax.ejb.Stateless
@javax.ws.rs.Path("restfuldb.chat")
public class ChatFacadeREST extends AbstractFacade<Chat> {

    @PersistenceContext(unitName = "RESTful_WrPU")
    private EntityManager em;

    private ChatPK getPrimaryKey(javax.ws.rs.core.PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;idChat=idChatValue;idprofC=idprofCValue;idutenteC=idutenteCValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        restfuldb.ChatPK key = new restfuldb.ChatPK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> idChat = map.get("idChat");
        if (idChat != null && !idChat.isEmpty()) {
            key.setIdChat(new java.lang.Integer(idChat.get(0)));
        }
        java.util.List<String> idprofC = map.get("idprofC");
        if (idprofC != null && !idprofC.isEmpty()) {
            key.setIdprofC(java.lang.Character.valueOf(idprofC.get(0)));
        }
        java.util.List<String> idutenteC = map.get("idutenteC");
        if (idutenteC != null && !idutenteC.isEmpty()) {
            key.setIdutenteC(java.lang.Character.valueOf(idutenteC.get(0)));
        }
        return key;
    }

    public ChatFacadeREST() {
        super(Chat.class);
    }

    @javax.ws.rs.POST
    @Override
    @javax.ws.rs.Consumes({javax.ws.rs.core.MediaType.APPLICATION_XML, javax.ws.rs.core.MediaType.APPLICATION_JSON})
    public void create(Chat entity) {
        super.create(entity);
    }

    @javax.ws.rs.PUT
    @javax.ws.rs.Path("{id}")
    @javax.ws.rs.Consumes({javax.ws.rs.core.MediaType.APPLICATION_XML, javax.ws.rs.core.MediaType.APPLICATION_JSON})
    public void edit(@javax.ws.rs.PathParam("id") javax.ws.rs.core.PathSegment id, Chat entity) {
        super.edit(entity);
    }

    @javax.ws.rs.DELETE
    @javax.ws.rs.Path("{id}")
    public void remove(@javax.ws.rs.PathParam("id") javax.ws.rs.core.PathSegment id) {
        restfuldb.ChatPK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @javax.ws.rs.GET
    @javax.ws.rs.Path("{id}")
    @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_XML, javax.ws.rs.core.MediaType.APPLICATION_JSON})
    public Chat find(@javax.ws.rs.PathParam("id") javax.ws.rs.core.PathSegment id) {
        restfuldb.ChatPK key = getPrimaryKey(id);
        return super.find(key);
    }

    @javax.ws.rs.GET
    @Override
    @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_XML, javax.ws.rs.core.MediaType.APPLICATION_JSON})
    public List<Chat> findAll() {
        return super.findAll();
    }

    @javax.ws.rs.GET
    @javax.ws.rs.Path("{from}/{to}")
    @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_XML, javax.ws.rs.core.MediaType.APPLICATION_JSON})
    public List<Chat> findRange(@javax.ws.rs.PathParam("from") Integer from, @javax.ws.rs.PathParam("to") Integer to) {
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
