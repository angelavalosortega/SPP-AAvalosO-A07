/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.aangelo.arreglos;
import java.util.Scanner;

/**
 *
 * @author Angel Avalos
 */
public class SPPAangeloArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int num;
        System.out.println("Bienvenido a la agenda electronica. Introduzca diez numeros telefonicos y se quedaran guardados en el sistema.");
        String [] agenda=new String[10];
        for (int i=0;i<10;i++){
            System.out.println("Introdusca el numero telefonico con valor "+i+" de este arreglo");
            agenda[i]=kb.nextLine();           
        }
        int arrayLength = agenda.length;
        System.out.println("Usted cuenta con un total de "+arrayLength+" numeros telefonicos");
        System.out.println("Introdusca el numero de arreglo con el telefono deseado");
        num=kb.nextInt();
        if (num<arrayLength || num>0){
            System.out.println("El numero telefonico en el arreglo "+num+" es"+agenda[num]);          
        }else{
            System.out.println("El numero de arreglo escogido no existe");
        }
        
        
    }
    
}
