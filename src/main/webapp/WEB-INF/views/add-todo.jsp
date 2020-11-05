<%@ include file ="../common/header.jspf"%>
<%@ include file ="../common/navigation.jspf"%>

	

	<div class="container">
	New Action item
		<ol>
			<c:forEach items="${todos}" var="todo">
				<li>${todo.name} &nbsp;${todo.category}</li>
			</c:forEach>
		</ol>
	<form method="POST" action="add-todo.do">
		<fieldset class="form-group">
			<label>Description :</label>
			<input name="name" type="text" class="form-control"/>
		</fieldset>
		<fieldset class="form-group">
			<label>Category :</label>
			<input name="category" type="text" class="form-control"/>
		</fieldset> 
			<input class="btn btn-success" name="add" type="submit" value="Submit"/>
			<a href="/list-todos.do" class="btn btn-info" role="button">Back</a> 					
	</form>
</div>


<%@ include file ="../common/footer.jspf" %>


</html>