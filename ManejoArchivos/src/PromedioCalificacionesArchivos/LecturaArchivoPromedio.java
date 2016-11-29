/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PromedioCalificacionesArchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author SALAS
 */
public class LecturaArchivoPromedio {

    private Scanner entrada;

    // permite al usuario abrir el archivo
    public void abrirArchivo() {
        try {
            entrada = new Scanner(new File("datosCalificaciones.txt"));
        } // fin de try
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del método abrirArchivo

    // lee registro del archivo
    public void leer_informacion() {
        double sum = 0;
        double suma;
        int i = 0;
        double arr[] = new double[4];
        try // lee registros del archivo, usando el objeto Scanner
        {
            while (entrada.hasNext()) {

                String linea = entrada.nextLine();
                // System.out.println(linea);
                ArrayList<String> linea_partes = new ArrayList<String>(Arrays.asList(linea.split(";")));
                //System.out.println(linea_partes);                
                sum = Integer.parseInt(linea_partes.get(2)) + Integer.parseInt(linea_partes.get(3));
                arr[i] = (sum / 2);
                System.out.printf("Promedio de calificaiones de %s %s es: %.2f\n", linea_partes.get(0), linea_partes.get(1), arr[i]);

                i++;
            } // fin de while
            suma = arr[0];
            for (i = 0; i < arr.length; i++) {
                if (suma < arr[i]) {
                    suma = arr[i];
                }
            }
            System.out.println("  -> El mejor promedio es: " + suma);
        } // fin de try
        catch (NoSuchElementException elementException) {
            System.err.println("El archivo no esta bien formado.");
            entrada.close();
            System.exit(1);
        } // fin de catch
        catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del metodo leerRegistros
    // cierra el archivo y termina la aplicación

    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close(); // cierra el archivo
        }
    } // fin del metodo cerrarArchivo
}
