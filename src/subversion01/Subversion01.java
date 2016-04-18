/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package subversion01;

import java.util.Scanner;

/**
 *
 * @author madrid
 */
public class Subversion01 {


    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);
       
    
        int cantidad_num=5;
        int cont=0;
        int[] array =new int[cantidad_num];
  //demanar numero      
        while(cont<cantidad_num){  
            System.out.println("ingresa numero");
            int numero=entrada.nextInt();
            array[cont]=numero;
            cont++;
        }
        
    //mostrar array    
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        
   //mostrar el mas petit
        int menor=array[0];
        for(int i=0; i<array.length;i++){
            if(array[i]<menor){
                menor=array[i];
            }
        }
        System.out.println("");
        System.out.println("El num mes petit es:" + menor);
        
    }
}
