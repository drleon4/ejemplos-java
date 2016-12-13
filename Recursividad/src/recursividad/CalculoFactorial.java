/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 *
 * @author SALAS
 */
public class CalculoFactorial {

   public double factorial(double numero){
       if (numero <= 1) {
           return 1;
       }else{
           return numero * factorial(numero-1);
       }
   }
   public void mostrarFactoriales(){
       for (int i = 0; i <= 10; i++) {
           System.out.printf("%d! = %.0f\n", i, factorial(i));
       }
   }
}
