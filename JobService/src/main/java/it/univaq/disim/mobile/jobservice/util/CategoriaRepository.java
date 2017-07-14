/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.univaq.disim.mobile.jobservice.util;

import it.univaq.disim.mobile.jobservice.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Francesca
 */
public interface CategoriaRepository extends JpaRepository<Categoria,Long>{
    Categoria findBynome(String nome);
}
