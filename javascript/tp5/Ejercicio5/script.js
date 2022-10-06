function diaSemana(){
	var fecha = new Date();
	var dia = ["domingo.jpg","lunes.jpg","martes.jpg","miercoles.jpg","jueves.jpg","viernes.jpg","sabado.jpg"]
	document.getElementById('imagen').src = "dias/"+dia[fecha.getDay()];
}