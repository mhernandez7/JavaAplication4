
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class JavaApplication5 {
    
    public static void main(String[] args) {
       
        Scanner read = new Scanner(System.in);
        float number1 = 0;
        Number n1 = new Number();
        
        System.out.println("Ingrese un numero para calcular el cuadrado: ");
        number1 = read.nextFloat();
        
        n1.setNumber(number1);
        System.out.println("El cuadrado del numero es: "+n1.NumberCuadrado());
        
    }
    
}
