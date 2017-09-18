/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.utils;

import com.cice.exception.FicheroNoLocalizado;
import com.cice.exception.FormatNotValid;
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

    

    public AlmacenNumeros() {

    }
    //1;2;17;23;public void guardarNumero(int numero) throws Fich
    public void guardarNumero(int numero) throws FicheroNoLocalizado, IOException   {
        //TODO: metodo recuperar el fichero y escribir el nuevo número
        FileReader reader =null;
        BufferedReader buffer=null;
        FileWriter writer =null;
        try {
            //lectura y escritura del nuevo número
            reader = new FileReader(FileSingleton.getInstance().getFichero());
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
            writer =new FileWriter(FileSingleton.getInstance().getFichero());
            PrintWriter pw = new PrintWriter(writer);
            pw.write(cadena.toString());
            pw.flush();
            pw.close();
            writer.close();
            
            
        } catch(FileNotFoundException fnfe){
            throw new FicheroNoLocalizado(FicheroNoLocalizado.MSG_NOENCONTRADO);
        } finally {
            if (reader!=null)
              reader.close();
            if (buffer!=null) 
                buffer.close();
        }
        
        
    }
    
    public void guardarNumeroFileWriter(int numero) throws FicheroNoLocalizado, IOException   {
        //TODO: metodo recuperar el fichero y escribir el nuevo número
        
        FileWriter writer =null;
        try {
            //escritura del fichero con la nueva cadena de caracteres
            writer =new FileWriter(FileSingleton.getInstance().getFichero(),true);
            writer.write(String.valueOf(numero));
            writer.write("\n");
            
        } catch(FileNotFoundException fnfe){
            throw new FicheroNoLocalizado(FicheroNoLocalizado.MSG_NOENCONTRADO);
        } finally {
            writer.flush();
            writer.close();
        }
    }
    public ArrayList<Integer> recuperarNumeros() throws FormatNotValid {
          ArrayList<Integer> listanumeros = null;
        try {
          
           
            FileReader reader = new FileReader(FileSingleton.getInstance().getFichero());
            BufferedReader bf =new BufferedReader(reader);
            String cadena;
            while ((cadena = bf.readLine()) != null) {
                System.out.println(cadena);
                listanumeros.add(Integer.parseInt(cadena));
            }
           
        } catch (IOException ex) {
            Logger.getLogger(AlmacenNumeros.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException nfe){
            throw new FormatNotValid(nfe.getMessage());
        }
         return listanumeros;
    }
    

}
