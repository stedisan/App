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
        int intToken = Math.abs(random.nextInt());
        return Long.toString(intToken, 200);

    }

}