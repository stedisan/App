/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.univaq.disim.mobile.jobservice.web;

import it.univaq.disim.mobile.jobservice.model.Prenotazione;
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
public class PrenotazioneController {
    
    @Autowired
    private JobServiceService service;

    @PostMapping("/signup")
    public boolean CreaPrenotazione(@RequestBody Prenotazione p) {
        service.createPrenotazione(p);
        return true;
    }

    @GetMapping("/delete/{id_prenot}")
    public Response CancellaPrenotazione(@PathVariable Long id_prenot) {
        service.deletePrenotazione(id_prenot);
        return Response.DEFAULT_RESPONSE_OK;
    }



    @PutMapping("prenotazioni")
    public Response ModificaPrenotazione(@RequestBody Prenotazione prenotazione,@PathVariable String token) {
        service.updatePrenotazione(token,prenotazione);
        return Response.DEFAULT_RESPONSE_OK;
    }
}
