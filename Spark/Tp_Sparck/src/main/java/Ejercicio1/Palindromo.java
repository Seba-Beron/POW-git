/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;


public class Palindromo {
    
    public boolean esPalindromo(String str){
        String sav="";
        for (int i = (str.length() - 1); i >= 0; i--){
            sav+=str.charAt(i);
	}
        return str.equals(sav);
    }
}
