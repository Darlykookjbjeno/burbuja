/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.burbuja;

import java.util.Scanner;

/**
 *
 * @author HOMEPC
 */
public class Burbuja {

    public static void main(String[] args) {
     
            Scanner Lector= new Scanner(System.in);
            
            int arreglo[], nvalores, aux;
            
            System.out.println("Escriba la cantidad de espacios que va a tener el arrglo");
            nvalores =Lector.nextInt();
            
            arreglo = new int[nvalores];
            
            for(int i=0;i<arreglo.length;i++){
            
                System.out.println("Digite el numero #"+(i+1));
                arreglo[i]=Lector.nextInt();
                
            }
            
            //metodo burbuja
            
            for(int i=0;i<(nvalores-1);i++){
                for(int j=0;j<(nvalores-1);j++){
                    if(arreglo[j]>arreglo[j+1]){
                         aux =arreglo[j];
                        
                        arreglo[j]=arreglo[j+1];
                        arreglo[j+1] = aux;
                    }
                }
            }
            
            
            System.out.println("Arreglo creciente");
            for(int i=0;i<nvalores;i++){
                System.out.println(arreglo[i]);
            }
            
            System.out.println("Arreglo creciente");
            for(int i=(nvalores-1);i>=0;i--){
                System.out.println(arreglo[i]);
            }
            
    }
}
