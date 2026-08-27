//Control de acceso de invitados a un cojunto residencial

package Primer_trabajo;

import java.util.Scanner;

/**
 *
 * Luis Alejandro Acuña Aldana 
 */
public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  res, aut; 
        
        System.out.println("para el contról de acceso relacione las preguntas: ");
        
        System.out.println("ingrese el tipo de persona: ");
        res= sc.nextInt();
        if (res==1){
            System.out.println("Bienvenido señor residente");
        }
        else if (res==2){
        System.out.println("por favor contacte al residente para que le permita el ingreso... ");
 
        
            System.out.println("el propietario le ha permitido el ingreso? ");
            aut=sc.nextInt(); 
            if (aut==1){
                System.out.println("bienvenido señor visitante...");
            }
            else if (aut==2){
            System.out.println("no se le ha permitido el ingreso");
        }
    }
}
}
