/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.exception;

import java.io.IOException;

/**
 *
 * @author cice
 */
public class FicheroNoLocalizado extends IOException {

    public static final String MSG_NOENCONTRADO="Fichero no encontrado";
    public FicheroNoLocalizado() {
        super();
    }

    public FicheroNoLocalizado(String message) {
        super(message);
    }
    
    
}
