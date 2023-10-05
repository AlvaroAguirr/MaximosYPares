/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maximoyminimo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ashkh
 */
public class MaximoyMinimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
    BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    String entrada;
    
    int t;
    int min=0;
    int par=0;
    int impar=0;
    int max=0;
    
    int[] arr;
            System.out.println("escriba el tamaño del arreglo");
            entrada = bufer.readLine();
             t=Integer.parseInt(entrada);
             
             arr= new int[t];
             
             System.out.println("llenado del arreglo de "+arr.length+" espacios ");
             System.out.println("+++++++");
             for(int i=0;i<t;i++){
             System.out.println("ingrese el valor ["+i+"] del arreglo");
             entrada = bufer.readLine();
             arr[i]=Integer.parseInt(entrada);
             }
     
             for (int recorrido:arr){
             if(recorrido>max){
                 max=recorrido;
             }
             if(recorrido<min){
                 min=recorrido;
             }
               
             }
              System.out.println("maximo es  "+max);
                 System.out.println("el minimo es "+min);
             
    
             for (int recopar:arr){
             if (recopar %2==0){
             par++;
            } else{
                 impar++;
             }
        }
             System.out.println("los pares son "+par);
             System.out.println("los impares son "+impar);
    
    
    }   
    }
    
