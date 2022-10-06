var x=0;
function imagen(){
	var img = ["noche.jpg","dia.jpg"];
	x++;
	document.getElementById('imagen').src = "img/"+img[x%2];
}