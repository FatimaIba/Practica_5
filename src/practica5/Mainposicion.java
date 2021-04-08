/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Mainposicion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int Numero;
        int tam[];
        

        tam = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print(i + ".Ingresa los numeros: ");
            tam[i] = sc.nextInt();
        }
        System.out.println("-----------------");
        System.out.println("Ingresa el numero a buscar:");
        Numero = sc.nextInt();
        int i = 0;
        while (i < 10 && tam[i] < Numero) {
            i++;
        }
        if(i==10){
                    System.out.print("No se encuentra : -1");
        }
        else{
        if( tam[i]== Numero){
            System.out.print(" Numero encontrado, en la posicion: " + i);
         
        }
        }
    }
}
