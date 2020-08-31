$(document).ready(function() {
	load_quality();
});

function xRange(args){
	var x = [];
	
	for(var i = 0; i<args.length; i++){
		x[i] = args[i].quality;
	}
	
	return x;
}

function yRange(args){
	var tsd = [];
	
	for(var i = 0; i<args.length; i++){
		tsd[i] = args[i].total_sulfur_dioxide;
	}
	
	return tsd;
}

function load_quality(){
	var url = "/winechart/tsdQualityList";
	
	$.ajax({
		type: "POST",
		url: url,
		success: function (args){
			var trace1 = {
				x: xRange(args),
				type: "histogram",
				opacity: 0.5,
				marker: {
					color: 'skyblue',
				},
			};
			
			var trace2 = {
				x: yRange(args),
				type: "histogram",
				opacity: 0.6,
				marker: {
					color: 'pink',
				},
			};
			
			var data = [trace1, trace2];
			
			var layout = {barmode: "overlay"};
			
			Plotly.newPlot('TsdQualityHistogram', data, layout);
		}
		
	})
}