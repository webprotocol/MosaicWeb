<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax.jsp</title>

<script src="/resources/plugins/jQuery/jQuery-2.1.4.min.js"></script>
</head>
<body>

<script type="text/javascript">
	$.getJSON("/replies/510/1", function(data) {
		console.log(data);
		alert("result + " + JSON.stringify(data))
	});

</script>
</body>
</html>