/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.univaq.disim.mobile.jobservice.web;


import it.univaq.disim.mobile.jobservice.model.Session;
import it.univaq.disim.mobile.jobservice.model.User;
import it.univaq.disim.mobile.jobservice.util.JobServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Francesca
 */

@RestController
@RequestMapping("/api")
public class UserController {
    
    @Autowired
    private JobServiceService service;

    @PostMapping("/login")
    public Response login(@RequestBody User u) {
        Session session = service.login(u.getUsername(), u.getPassword());
        if (session != null) {
            Response<Login> result = new Response<>(true, Response.DEFAULT_RESPONSE_OK.getMessage());
            Login login = new Login();
            login.setToken(session.getToken());
            login.setUsername(session.getUser().getUsername());
            login.setNome(session.getUser().getNome());
            login.setCognome(session.getUser().getCognome());
            login.setEmail(session.getUser().getEmail());
            login.setTelefono(session.getUser().getTelefono());
            login.setDatadinascita(session.getUser().getDatadinascita());
            login.setCittà(session.getUser().getCittà());
            login.setEtà(session.getUser().getEtà());
            login.setPassword(session.getUser().getPassword());
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

    @PostMapping("/utenti")
    public Response createUser(@RequestBody User user) {
        boolean result = service.createUser(user);
        Response<Object> response = new Response<>();
        response.setResult(result);
        if (result) {
            response.setMessage("Ok");
        } else {
            response.setMessage("User already exist");
        }
        return response;
    }

    @PutMapping("/utenti/{token}")
    public Response updateUser(@RequestBody User user, @PathVariable String token) {
        service.updateUser(token, user);
        return Response.DEFAULT_RESPONSE_OK;
    }
}
