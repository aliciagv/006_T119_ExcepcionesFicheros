/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.utils;

import java.io.File;

/**
 *
 * @author Alicia
 */
public class FileSingleton {
    
    private static FileSingleton instance;
    private File fichero;
    private static final String name="almacen.txt";
    
    private FileSingleton() {
    
    }
    
    public static FileSingleton getInstance(){
        if (instance==null) {
            instance=new FileSingleton();
            instance.fichero= new File(name);
        } 
        return instance;
    }

    public File getFichero() {
        return fichero;
    }

    public void setFichero(File fichero) {
        this.fichero = fichero;
    }
    
}
