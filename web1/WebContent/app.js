 
 function save() {
	const element = document.getElementById('firstName');
	const ageElement = document.getElementById('age');
	
	console.log('Name : ' + element.value);
	console.log('Age : ' + ageElement.value);
	
	const elements = document.getElementsByTagName('input');
	for(let i = 0; i < elements.length; i++) {
		
		if(elements[i].type === 'radio') {
			console.log(elements[i]);
		}
		
	}
}