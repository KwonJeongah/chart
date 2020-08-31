  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
 
<title>Visualize Wine Quality Chart</title>
    <%@include file="./common_resource.jsp"%>
    
    <link href="${pageContext.request.contextPath}/resources/css/home.css" rel="stylesheet" />

 
</head>

<body>
	<br><br>
	<h1 class="title">Wine Quality Data</h1>
	<br><br>
	
	<script src="http://d3js.org/d3.v3.min.js"></script>
	<script src="http://labratrevenge.com/d3-tip/javascripts/d3.tip.v0.6.3.js"></script>
	<script src="https://cdn.plot.ly/plotly-latest.min.js"></script>
	
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/qualityBar.js"></script>
  	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/faPhBox.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/tsdQualityHisto.js"></script>
	
	<h3 style="margin-top:50; margin-bottom:50">Quality Bar Chart</h3>
	<div id = "QualityBar"></div>
	<h3 style="margin-top:50; margin-bottom:50">Fixed Acidity and pH Box plot</h3>
	<div id = "faPhBox"></div>
	<h3 style="margin-top:50; margin-bottom:50">Total Surfur Dioxide and Quality histogram</h3>
	<div id = "TsdQualityHistogram"></div>
	
	
</body>
</html>