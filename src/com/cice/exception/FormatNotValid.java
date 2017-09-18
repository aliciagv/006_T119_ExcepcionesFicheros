/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.exception;

/**
 *
 * @author Alicia
 */
public class FormatNotValid extends RuntimeException{

    public FormatNotValid() {
    }

    public FormatNotValid(String message) {
        super(message);
    }
    
}
