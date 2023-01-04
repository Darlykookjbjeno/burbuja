/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.burbuja;

import java.util.Scanner;

/**
 *
 * @author HOMEPC
 */
public class seleccion {
    public static void main(String[] args) {
     
            Scanner Lector= new Scanner(System.in);
            
            int arreglo[],nvalores,min,aux;
            
            System.out.println("Escriba la cantidad de espacios que va a tener el arrglo");
            nvalores =Lector.nextInt();
            
            arreglo = new int[nvalores];
            
            for(int i=0;i<arreglo.length;i++){
            
                System.out.println("Digite el numero #"+(i+1));
                arreglo[i]=Lector.nextInt();
                
            }
            
            for(int i=0;i<nvalores;i++){
            
                min =i;
                for(int j=i+1;j<nvalores;j++){
                
                    if(arreglo[j]<arreglo[min]){
                        min =j;
                    }
                }
                aux = arreglo[i];
                arreglo[i]= arreglo[min];
                arreglo[min]=aux;
            }
            
            System.out.println("arreeglo creciente");
            for(int i=0;i<nvalores;i++){
                System.out.println(arreglo[i]);
            }
            
            System.out.println("decrciente");
            for(int i=(nvalores-1);i>=0;i--){
                System.out.println(arreglo[i]);
            }
    }
    
}
