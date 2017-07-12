/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.univaq.disim.mobile.jobservice.web;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 *
 * @author Francesca
 */
@RestControllerAdvice
public class ExceptionControllerAdvice {
    
     @ExceptionHandler(Exception.class)
    public Response exception(Exception e) {
        Response<Object> result = new Response<>(false, "error=" + e.getMessage());
        return result;
    }
}
