/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.univaq.disim.mobile.jobservice.webimpl;

import it.univaq.disim.mobile.jobservice.business.Jobservice;
import it.univaq.disim.mobile.jobservice.model.Session;
import it.univaq.disim.mobile.jobservice.model.User;
import javax.xml.ws.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private Jobservice service;

    @PostMapping("/login")
    public Response login(@RequestBody User u) {
        Session session = service.login(u.getUsername(), u.getPassword());
        if (session != null) {
            Response<Login> result = new Response<>(true, Response.DEFAULT_RESPONSE_OK.getMessage());
            Login login = new Login();
            login.setToken(session.getToken());
            login.setFirstname(session.getUser().getFirstname());
            login.setLastname(session.getUser().getLastname());
            login.setEmail(session.getUser().getEmail());
            result.setData(login);
            return result;
        } else {
            return Response.DEFAULT_RESPONSE_KO;
        }

    }

    @GetMapping("/logout/{token}")
    public Response logout(@PathVariable String token) {
        service.logout(token);
        return Response.DEFAULT_RESPONSE_OK;
    }

    @PostMapping("/users")
    public Response createUser(@RequestBody User user) {
        service.createUser(user);
        return Response.DEFAULT_RESPONSE_OK;
    }

    @PutMapping("/users/{token}")
    public Response updateUser(@RequestBody User user, @PathVariable String token) {
        service.updateUser(token, user);
        return Response.DEFAULT_RESPONSE_OK;
    }

}
