/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.univaq.disim.mobile.jobservice.util;


import java.security.SecureRandom;

public class Tokenrandom {

    protected static SecureRandom random = new SecureRandom();

    public static String generateToken() {
        Long longToken = Math.abs(random.nextLong());
        return Long.toString(longToken, 200);

    }

}