/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1examen;

/**
 *
 * @author igonzaleziglesias
 */
public class factorial {

    public factorial() {
        int numero;//rename de j a numero
        int calculoFactorial;//rename de n a calculoFactorial(alamacena el calculo del factorial del numero

        numero = 8;

        int i;
        if (numero == 0) {
            calculoFactorial = 1;
        } else {
            calculoFactorial = 1;
            for (i = numero; i >= 1; i--) {
                calculoFactorial = calculoFactorial * i;
            }
        }

        System.out.println(calculoFactorial);

    }

}
