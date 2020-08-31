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

function getCount(args){
	var count = [];
	
	for(var i = 0; i<args.length; i++){
		count[i] = args[i].count;
	}
	
	return count;
}

function load_quality(){
	var url = "/winechart/qualityList";
	
	$.ajax({
		type: "POST",
		url: url,
		success: function (args){
			var data = [
				{
					x: xRange(args),
					y: getCount(args),
					type: 'bar'
				}
			];
			
			Plotly.newPlot('QualityBar', data);
		}
		
	})
}