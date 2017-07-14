/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.univaq.disim.mobile.jobservice.util;

import it.univaq.disim.mobile.jobservice.model.Professionista;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Francesca
 */
public interface ProfessionistaRepository extends JpaRepository<Professionista,Long> {
    Professionista findById(Long id_prof);
}
