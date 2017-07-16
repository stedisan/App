/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.univaq.disim.mobile.jobservice.util;

import it.univaq.disim.mobile.jobservice.model.Preferiti;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Stefania
 */

public interface PrefertitiRepository extends JpaRepository<Preferiti, Long>{
    Preferiti findById (Long id_pref);
}
