var a = [2,3,3,4,5,5,5,5,6,7,7,8,8,8,9];

var result = {};

function occurance(a){
	for(var i=0; i<a.length;i++){
		console.log("a[i]: ", a[i]);	
		console.log("result[a[i]]:  ", result[a[i]])
		if(!result[a[i]]) {
			result[a[i]] = 0;
		}
		console.log(">>>>>>>>>>", result);
		++result[a[i]]
	}

	console.log("result:::  ", result);
}