/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PromedioCalificacionesArchivos;

/**
 *
 * @author SALAS
 */
public class EjecutorPromedio {
    public static void main(String[] args) {
      LecturaArchivoPromedio aplicacion = new LecturaArchivoPromedio();

      aplicacion.abrirArchivo();
      aplicacion.leer_informacion();
      aplicacion.cerrarArchivo();
    }
}
