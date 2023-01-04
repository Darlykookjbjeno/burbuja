
package com.mycompany.burbuja;

import java.util.Scanner;

public class insercion {
    public static void main(String[] args) {
     
            Scanner Lector= new Scanner(System.in);
            
            int arreglo[],nvalores,pos,aux;
            
            System.out.println("Escriba la cantidad de espacios que va a tener el arrglo");
            nvalores =Lector.nextInt();
            
            arreglo = new int[nvalores];
            
            for(int i=0;i<arreglo.length;i++){
            
                System.out.println("Digite el numero #"+(i+1));
                arreglo[i]=Lector.nextInt();
                
            }
            
            for(int i=0;i<nvalores;i++){
                pos = i;
                aux = arreglo[i];
                
                while(pos>0 && (arreglo[pos-1]>aux)){  
                    arreglo[pos]=arreglo[pos-1];
                    pos--;
                }
                
                arreglo[pos]=aux;
            }
            System.out.println("creciente");
            for(int i=0; i<nvalores;i++){
                System.out.println(arreglo[i]);
            }
            
            System.out.println("decreciente");
            for(int i=(nvalores-1);i>=0;i--){
                System.out.println(arreglo[i]);
            }
    }
}
