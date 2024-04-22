<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Dark Mode Table</title>
<style>
  body {
    background-color: #1f1f1f;
    color: #fff;
    font-family: Arial, sans-serif;
  }
  
  table {
    width: 100%;
    border-collapse: collapse;
    margin-bottom: 20px;
  }
  
  th, td {
    padding: 12px;
    text-align: left;
    border-bottom: 1px solid #333;
  }
  
  th {
    background-color: #333;
    color: #fff;
    font-weight: bold;
  }
  
  td {
    background-color: #444;
  }
  
  tr:nth-child(even) td {
    background-color: #555;
  }
  
  .highlight {
    background-color: #ffcc00;
    color: #000;
  }
</style>
</head>
<body>

<table>
  <thead>
    <tr>
     
      <th>Name</th>
      <th>Email</th>
      <th>Password</th>
     <th>Action</th>
    </tr>
  </thead>
  <tbody>
   <c:forEach items="${ku}" var="e">
    <tr>

  <td class="highlight">${e.uname}</td>
         <td class="highlight">${e.uemail}</td>
      <td class="highlight">${e.upass}</td>
   
      <td>
    <a href="editdata/${e.id}">edit</a>
      <a href="del/${e.id}">delete</a>
      
      </td>
      
      
      
    </tr>
  </c:forEach>
  </tbody>
</table>

</body>
</html>