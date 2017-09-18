/*
Vamos a crear una clase que nos permita almacenar y recuperar datos de un almacén
permanente (fichero). La clase, a la que llamaremos AlmacenNumeros, tendrá dos métodos
guardarNumero() que almacenará en el fichero el número suministrado como parámetro, y
recuperarNumeros() que devolverá́un ArrayList con todos los números almacenados.
Para informar al programador que utiliza la clase de las situaciones anómalas que se pueden
dar, como que exista un problema con la localización del almacén permanente o los datos no
se puedan recuperar como números, se crearán dos clases de excepción personalizadas que
permitan al programador abstraerse de detalles relacionados con el uso de ficheros.
 */
package com.cice.main;

import com.cice.exception.FicheroNoLocalizado;
import com.cice.utils.AlmacenNumeros;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alicia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            AlmacenNumeros almacen=new AlmacenNumeros();
            almacen.guardarNumeroFileWriter(5);
            almacen.guardarNumero(6);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } 
       
    }
    
}
