<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html>
<head>
<title>Edit Profile</title>
<style>
body {
	font-family: Arial, sans-serif;
	background: #f4f4f4;
	padding: 20px;
}

.form-container {
	max-width: 500px;
	margin: auto;
	background: white;
	padding: 20px;
	border-radius: 10px;
	box-shadow: 0 0 10px gray;
}

input, textarea {
	width: 100%;
	padding: 10px;
	margin: 10px 0;
}

button {
	padding: 10px 20px;
	background: green;
	color: white;
	border: none;
	border-radius: 5px;
}
</style>
</head>
<body>

	<div class="form-container">
		<h2>Edit Profile</h2>

		<form action="/usereditprofile" method="post">
		<%--
		 	<label>User Id:</label> <input type="text" name="userid"
				value="${user.userid }" required /> --%>
				<label>First Name:</label> <input
				type="text" name="firstname" value="${user.firstname}" required />

			<label>Last Name:</label> <input type="text" name="lastname"
				value="${user.lastname}" required /> <label>User Name:</label> <input
				type="text" name="username" value="${user.username}" required /> <label>Email:</label>
			<input type="email" name="email" value="${user.email}" readonly /> <label>Phone
				Number:</label> <input type="text" name="phonenumber"
				value="${user.phonenumber}" required /> <label>Address:</label>
			<textarea name="address" rows="4" required>${user.address}</textarea>

			<label>Password:</label> <input type="password" name="password"
				value="${user.password}" required />

			<button type="submit">Update Profile</button>
		</form>
	</div>

</body>
</html>
