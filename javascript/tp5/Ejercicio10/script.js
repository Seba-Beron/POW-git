function verificar(){
	var p1 = document.querySelector('input[name="pregunta1"]:checked');
	var p2 = document.querySelector('input[name="pregunta2"]:checked');
	var p3 = document.querySelector('input[name="pregunta3"]:checked');

	if((p1.value == "c") && (p2.value == "a") && (p3.value == "b")){
		alert("Las respuestas son correctas");
	}	
	else{
		alert("Ingreso una respuesta incorrecta, vuelva a intentarlo");
	} 
}