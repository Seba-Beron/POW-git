var numA="";
var numB="";
var operacion="";

function btn_numero(value){
  if(operacion == ""){
    numA += value;
  }
  else{
    numB += value;
  }
  document.getElementById('visor').value=numA+operacion+numB;
}

function btn_operacion(value){

    if (operacion != "" && numB != ""){
      btn_igual();
    }
    operacion=value;
    document.getElementById('visor').value=numA+operacion+numB;
  } 

function reset(){
  numA = numB = operacion = "";
  document.getElementById('visor').value="";
}

function btn_igual(){
  switch(operacion){
        case "+":
          numA = parseFloat(numA) + parseFloat(numB);
          break;
        case "-":
          numA = parseFloat(numA) - parseFloat(numB);
            break;
        case "*":
          numA = parseFloat(numA) * parseFloat(numB);
          break;
        case "/":
          numA = parseFloat(numA) / parseFloat(numB);
          break;
      }
      numB = operacion = "";  
  document.getElementById('visor').value=numA;
}