/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.estructuradatos;

import java.util.Scanner;



/**
 *
 * @author alumnog
 */
public class Triangulo {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner in = new Scanner(System.in);

     int area;
     int base = 0;
     int altura = 0;
 System.out.println("Ingresa la base");
        base=in.nextInt();
 System.out.println("Ingresa la altura");
        altura=in.nextInt();


 area = ((base*altura)/2);
 
        System.out.println("El resultado es: "+area);
    }
    
}
