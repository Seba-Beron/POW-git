/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Ejercicio5;

import static java.lang.Float.parseFloat;

public class Calculadora {
    static String numA="";
    static String numB="";
    static String operacion="";

public String btn_numero(String value){
  if(operacion.equals("")){
    numA += value;
  }
  else{
    numB += value;
  }
  
  return numA+operacion+numB;
}

public String btn_operacion(String value){
    if (!"".equals(numA) && !"-".equals(numA)){
        if (!operacion.equals("") && !numB.equals("")){
            btn_igual();
        }
    operacion=value;
    } 
    if ("".equals(numA) && "-".equals(value)){
        numA="-";
    }
    
    return numA+operacion+numB;
  } 

public String reset(){
    numA = numB = operacion="";
    return "";
}

public String btn_igual(){
    System.out.print("paso");
  switch(operacion){
        case "+":
          numA = ""+(parseFloat(numA) + parseFloat(numB));
          break;
        case "-":
          numA = ""+(parseFloat(numA) - parseFloat(numB));
            break;
        case "*":
          numA = ""+(parseFloat(numA) * parseFloat(numB));
          break;
        case "/":
          numA = ""+(parseFloat(numA) / parseFloat(numB));
          break;
      }
      numB = operacion = "";  
      
  return numA;
}
}
