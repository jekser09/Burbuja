/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burbuja;
import java.io.*;
/**
 *
 * @author Torrev_101
 */
public class MetodoB {
    public static void main(String [] args){
        int i,j,aux;
        int a[]=new int[]{11,7,3,1,5};
        
        for(i=0;i<5;i++){
            for(j=i+1;j<5;j++){
                if(a[i]>a[j]){
                    aux=a[i];
                    a[i]=a[j];
                    a[j]=aux;
                }
            }
        }
        for(i=0;i<5;i++){
            System.out.print(a[i]+"|");
        }
    }
}
