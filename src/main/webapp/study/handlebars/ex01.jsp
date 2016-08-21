<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>template.jsp</title>

<script src="/resources/plugins/jQuery/jQuery-2.1.4.min.js"></script>
<script	src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>

<script id="template" type="text/x-handlebars-template">
	{{#each .}}
	        <li>
				{{text}} /// {{prettifyDate regdate}} /// 
				{{#eqReplyer replyer}}
					<small> ### true ###</small>
				{{/eqReplyer}}
        	</li>
    {{/each}}
</script>
</head>
<body>

<ul id="xxx">

</ul>

<script type="text/javascript">
	Handlebars.registerHelper("eqReplyer", function(replyer, block) {
		var accum = '';
		if (replyer == true) {
			accum += block.fn();
		}
		return accum;
	});
	
	Handlebars.registerHelper("prettifyDate", function(timeValue) {
		var dateObj = new Date(timeValue);
		
		var year = dateObj.getFullYear();
		var month = dateObj.getMonth() + 1;
		var date = dateObj.getDate();
		
		return year + "/" + month + "/" + date;
	});
	
	
	var template = Handlebars.compile($('#template').html());

	var dataArr = [
		{text : "Hello Handlers 1", regdate : new Date().getTime(), replyer : true},               
		{text : "Hello Handlers 2", regdate : new Date().getTime(), replyer : false},
		{text : "Hello Handlers 3", regdate : new Date().getTime(), replyer : false},
		{text : "Hello Handlers 4", regdate : new Date().getTime(), replyer : true}
	];
	
	
	var html = template(dataArr);
	console.log("html = " + html);
	$("#xxx").html(html);

</script>
</body>
</html>