/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploPractica1Archivos;

/**
 *
 * @author SALAS
 */
public class EjecutorCalificacionesArchivos {
    public static void main( String args[] )
   {
      Califiaciones aplicacion = new Califiaciones();

      aplicacion.abrir_archivo();
      aplicacion.agregar_informacion();
      aplicacion.cerrar_archivo();
   } // fin de main
}
