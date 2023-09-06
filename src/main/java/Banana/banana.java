
package Banana;

import java.util.Scanner;

/**
 *
 * @author Mike
 */
public class banana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        System.out.println("Ingrese el nombre de los almnos: ");
        Scanner it = new Scanner(System.in);
        String weon = it.nextLine();
        String[] alumnos = weon.split(",");


        for (String a : alumnos) {
        String[] alumno = a.split(" ");
        String id = alumno[0];
        String primerNombre = alumno[3];
        String primerApellido = alumno[1];

        System.out.println("ID: "+ id + " - " +primerNombre+" "+primerApellido);


}

        


    }
    
}
