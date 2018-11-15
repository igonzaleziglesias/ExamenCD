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
public class numerosprimos {

    public static boolean condicion = false;//cambio de nombre de p a condicion

    public numerosprimos(String arg[]) {

        int numeroDigitos = 0;//cambio de nombre de numDigitos a numeroDigitos
        int ndigitos = 0;
        numeroDigitos = Integer.parseInt(arg[0]);
        if (numeroDigitos <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }

        for (int i = 1; i <= 99999; i++) {
            int divisionEntera = i;

            int contador = 0;

            while (divisionEntera != 0) {
                divisionEntera = divisionEntera / 10;
                contador++;
            }

            ndigitos = contador;

            if (ndigitos == numeroDigitos) {
                if (i < 4) {
                    condicion = true;
                } else {
                    if (i % 2 == 0) {
                        condicion = false;
                    } else {
                        int contador1 = 0;
                        int i1 = 1;
                        int limite = (i - 1) / 2;
                        if (limite % 2 == 0) {
                            limite--;
                        }

                        while (i1 <= limite) {
                            if (i % i1 == 0) {
                                contador1++;
                            }
                            i1 += 2;
                            if (contador1 == 2) {
                                i1 = limite + 1;
                            }
                        }

                        if (contador1 == 1) {
                            condicion = true;
                        }
                    }
                }

                if (condicion == true) {
                    System.out.println(i);
                }
            }
        }
    }
}
