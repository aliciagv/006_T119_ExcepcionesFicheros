/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.utils;

import com.cice.exception.FicheroNoLocalizado;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cice
 */
public class AlmacenNumeros {

    private static final String NOMBRE_FICHERO = "almacen.txt";
    private static File fichero;

    public AlmacenNumeros() {

        fichero = new File(NOMBRE_FICHERO);
    }
    //1;2;17;23;
    public void guardarNumero(int numero) throws FicheroNoLocalizado, IOException   {
        //TODO: metodo recuperar el fichero y escribir el nuevo número
        FileReader reader =null;
        BufferedReader buffer=null;
        FileWriter writer =null;
        try {
            //lectura y escritura del nuevo número
            reader = new FileReader(fichero);
            buffer = new BufferedReader(reader);
            StringBuilder cadena = new StringBuilder(buffer.readLine());
            cadena.append(";").append(numero);
            reader.close();
            buffer.close();
            
           /* String cadena ;
            StringBuilder ficherocompleto;
            while ((cadena=buffer.readLine()!=null)){
                ficherocompleto.append(cadena);
            }*/
           
           
            //escritura del fichero con la nueva cadena de caracteres
            writer =new FileWriter(fichero);
            PrintWriter pw = new PrintWriter(writer);
            pw.write(cadena.toString());
            pw.flush();
            pw.close();
            writer.close();
            
            
        } catch(FileNotFoundException fnfe){
            throw new FicheroNoLocalizado(FicheroNoLocalizado.MSG_NOENCONTRADO);
        } finally {
            reader.close();
            buffer.close();
        }
        
        
    }

    public ArrayList<Integer> recuperarNumeros() throws FileNotFoundException {
        ArrayList<Integer> listanumeros = null;
        //TODO: recupera el fichero, lee todos los números y devuelve un Array con ellos
        FileReader reader = new FileReader(fichero);
        BufferedReader buffer =new BufferedReader(reader);
       
        

        return listanumeros;

    }

}
