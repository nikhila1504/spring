<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<jsp:include page="/header" />
<section style="padding:10px; min-heigt:400px;">
	<h2>${msg }</h2>
	<form method="get">
	<label>Select Saluation:
		<select name="salut">
			<option value="">------select--------</option>
			<option value="Mr.">Mister</option>
			<option value="Mrs.">Mistress</option>
			<option value="Miss.">Miss</option>
			<option value="Dr.">Doctor</option>
		</select>
	
	</label>
		<label>Enter userName: <input type="text" name="unm"/></label>
		<button>DONE</button>
	</form>


</section>