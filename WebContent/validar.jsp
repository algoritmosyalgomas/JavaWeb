<% 
	if (session.getAttribute("usuario") == null) {
		pageContext.forward("index.jsp");
	}
%>