/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.estructuradatos;

import java.util.Scanner;
import sun.net.www.content.audio.x_aiff;

/**
 *
 * @author alumnog
 */
public class Profesor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    Scanner in = new Scanner(System.in);

        int salarioI = 1500;
        int incremento1;
        int incremento2;
        int incremento3;
        int incremento4;
        int incremento5;
        int incremento6;
        incremento1 = (int) (salarioI + (salarioI*.10));
        System.out.println("El salario del primer año fue: "+incremento1);
        incremento2 = (int) (incremento1+(incremento1*10));
       System.out.println("El salario del segundo año fue: "+incremento2);
    }
    
}
