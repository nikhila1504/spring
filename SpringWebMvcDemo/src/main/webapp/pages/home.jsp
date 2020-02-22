<html>
<body>

<h1>HEY NIKHILA</h1>
<h1> ${pageTitle}</h1>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<section style="padding:10px; min-height:400px;">
	<h2>${pageTitle}</h2>
	<h3>Developers</h3>
	<ol>
		<c:forEach var="d" items="${developers }">
			<li>${d }</li>
		</c:forEach>
	
	</ol>
</body>


</html>