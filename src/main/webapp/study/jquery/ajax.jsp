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
	$.ajax({
		type : 'put',
		url : '/replies/17',
		headers : {
			"Content-Type" : "application/json"
		},
// 		dataType : 'text',
		data : JSON.stringify({
			bno : 511,
			replyer : 'xxx',
			replytext : '수정2222'
		}),
		success : function(result) {
			console.log("result: " + result);
			if (result == 'SUCCESS') {
				alert("등록 되었습니다." + result);
			}
		},
		error: function(error) {
			alert("error" + error);
		}
	});

</script>
</body>
</html>