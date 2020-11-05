<%@ include file ="../common/header.jspf"%>
<%@ include file ="../common/navigation.jspf"%>

<div class ="container">
<table class="table table-striped">
	<caption>Your todos are</caption>
	<thead>
	<tr>
		<th>Description</th>
		<th>Category</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${todos}" var="todo">
	<tr>
		<td>${todo.name}</td>
		<td>${todo.category}</td>
		<td><a class="btn btn-danger" href="/delete-todo.do?name=${todo.name}&category=${todo.category}">Delete</a></td>
	</tr>
	</c:forEach>
	
	</tbody>
</table>
	<a class="btn btn-success" href="/add-todo.do">Add New Todo</a>
</div>

<%@ include file ="../common/footer.jspf"%>

</html>