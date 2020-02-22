<%@page import="java.time.LocalDate" %>
<html>
<head>
<title>Home Page</title>
<link rel="stylesheet" href="css/site.css" />
</head>
<body>
	<header>
		<h3 style="text-align :right">
			<%=LocalDate.now() %>
		</h3>
		<h1 style="border-bottom:1px solod black">${appTitle }</h1>
	
	</header>
	<nav>
		<a href="home">Home</a>
		<a href="hello">Hello</a>
		<a href="visitor">Visitor</a>
	</nav>