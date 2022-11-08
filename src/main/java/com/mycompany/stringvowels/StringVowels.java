/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.stringvowels;

import java.util.Scanner;

/**
 *
 * @author Erik
 */
public class StringVowels {

    public static void main(String[] args) {
        
        
        Scanner InData=new Scanner(System.in);
        System.out.println("Ingresa que frase se revisara numero de vocales ");
        String text=InData.nextLine();
        
        
        //String text= "La lluvia en Sevilla es una maravilla";
        
        int Contador=0;
        for(int i=0; i<text.length();i++){
            if(text.charAt(i)=='a'|| 
                    text.charAt(i)=='e'||
                    text.charAt(i)=='i'||
                    text.charAt(i)=='o'||
                    text.charAt(i)=='u'){
                Contador++;
                
            }
        }

        System.out.println("Hay "+ Contador + " Vocales");
    }
}
