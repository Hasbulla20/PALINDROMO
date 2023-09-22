/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.palindromo;

import java.util.Scanner;

/**
 *
 * @author Marco Lopez, Jonathan Felix
 */
public class PALINDROMO {

    public static void main(String[] args) {
       
   //Permite que sea leída la palabra del usuario. 
Scanner frase = new Scanner(System.in); 
//Representa una cadena de caracteres. 
String palabra; 
//Utilizamos char para poder almacenar caracteres individuales en "palindromo". 
char [] palindromo; 
int izq, der;
//Refleja en pantalla el texto "Ingrese la frase a evaluar" para que el usuario ingrese una frase, y prosiga a evaluarla. 

        System.out.println("Ingrese la frase a evaluar"); 
palabra = frase.nextLine(); 

//Remplaza caracteres por otros nuevos. 

palabra = palabra.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u").replace(" ", "").replace(".", "").replace(",", ""); 

palindromo = palabra.toCharArray(); 

//Permite la enumeración de palabras. 

izq = 0; der = palindromo.length -1; 

//Operación que analisa si el indice izquierdo y derecho son iguales. 
while(izq < der){ 

if(palindromo[izq] == palindromo[der]){ 
der --; 
izq ++; 
}else{ 
//Después de analizar la frase, refleja en pantalla si no cumple con lo pedido. 

         System.out.println("La palabra no es palindroma"); 

break; } } 

//Después de analizar la frase, refleja en pantalla si cumple con lo pedido. 

if(izq == der){ 

         System.out.println("La palabra es palindroma"); } 
} 
}
    
