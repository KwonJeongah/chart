$(document).ready(function() {
	load_quality();
});

function xRange(args){
	var x = [];
	
	for(var i = 0; i<args.length; i++){
		x[i] = args[i].ph;
	}
		
	return x;
}

function yRange(args){
	var y = [];
	
	for(var i = 0; i<args.length; i++){
		y[i] = args[i].fixed_acidity;
	}
	
	return y;
}

function load_quality(){
	var url = "/winechart/faPhList";
	
	$.ajax({
		type: "POST",
		url: url,
		success: function (args){
			
			var trace1 = {
				x: xRange(args),
				type: 'box',
				name: 'pH'
			};
			
			var trace2 = {
				x : yRange(args),
				type: 'box',
				name: 'fixed_acidity'
			};
			
			var data = [trace1, trace2];
			
			var layout = {
				title: 'Horizontal Box Plot'
			};
			
			Plotly.newPlot('faPhBox', data, layout);
		}
		
	})
}