<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<jsp:include page="/header" />
<section style="padding:10px; min-heigt:400px;">
	
	<h3>Hello ! ${v.firstName } ${v.lastName }!</h3>
	<h4>You are Registered</h4>
	<h4>Oh !You are Only ${v.age } years old</h4>
	
</section>

<jsp:include page="/footer"/>