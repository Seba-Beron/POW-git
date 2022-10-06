function reloj(){
	var fecha = new Date();
	var diaSemana = fecha.getDay();
	var dias = ["Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"];
	var dia = fecha.getDate();
	var mes = fecha.getMonth();
	var meses = ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"];
	var year = fecha.getFullYear();

	var hora = fecha.getHours();
	var min = fecha.getMinutes();
	var seg = fecha.getSeconds(); 

	var fecha = document.getElementById('fecha');
	var horas = document.getElementById('hora');

	fecha.innerHTML = dias[diaSemana]+" "+dia+" de "+meses[mes]+" del "+year; 
	horas.innerHTML = hora+" : "+min+" : "+seg;


	setInterval("reloj()",100);
}