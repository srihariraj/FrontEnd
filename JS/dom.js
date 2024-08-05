function doSomething(){
	let A="";
	let marks=[89,98,78,89,67,87];

	for( let x in marks){
		if(x%2==0){
			A=A+marks[x]+" ";
		}
	}

	document.getElementById("ans").innerHTML = A;
}