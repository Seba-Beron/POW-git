function verificar(){
	var num;
	num= document.getElementById('numero');
	res= document.getElementById('respuesta');

	if(parseFloat(num.value) > 0 && parseFloat(num.value)%1 == 0){
		res.innerHTML = num.value + " es un valor Entero Positivo";
	}
	else{
		res.innerHTML = num.value+" no es un valor Entero Positivo";
	}	
}
