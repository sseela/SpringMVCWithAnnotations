<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  


<form:form action="/postStudent" method="post" modelAttribute="student">
	Enter name<form:input path="name"/><br/>
	<%-- <form:errors path="name"></form:errors> --%>
	Enter email<form:input path="email"/><br/>
	<%-- <form:errors path="email"></form:errors> --%>
	<input type="submit">submit</input>
</form:form>