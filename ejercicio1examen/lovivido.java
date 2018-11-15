/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1examen;

import javax.swing.JOptionPane;

/**
 *
 * @author igonzaleziglesias
 */
public class lovivido {

    public lovivido() {
        String nombre;//cambio de nombre de n años nombre(nombre de la persona pedido por teclado)
        String edad;//cambio de nombre de e años edad(edad de la persona pedida por teclado)

        int mes;//cambio de nombre de m años mes
        int dias;//cambio de nombre de d años dias
        int horas;//cambio de nombre de h años horas
        int años;//cambio de edad de a años(mismo valor q edad pero en int en vez de string)

        nombre = JOptionPane.showInputDialog("Escriba su nombre: ");
        edad = JOptionPane.showInputDialog("Escriba su edad: ");

        años = Integer.parseInt(edad);

        mes = (años * 12);
        dias = (años * 365);
        horas = (dias * 24);

        JOptionPane.showMessageDialog(null, "Meses: " + mes, "Numero de meses vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Días: " + dias, "Numero de días vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Horas: " + horas, "Numero de horas vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }

}
