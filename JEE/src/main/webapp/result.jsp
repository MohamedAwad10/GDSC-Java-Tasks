<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>result</title>
</head>
<body>
    <%
        String error = (String) request.getAttribute("error");
        if(error != null){
    %>
    <h1 style="color: red;"><%= error %></h1>
    <br>
    <a href="index.html">Back</a?
    <%
        } else {
            int days = (int) request.getAttribute("days");
            int hours = (int) request.getAttribute("hours");
            int minutes = (int) request.getAttribute("minutes");
            int seconds = (int) request.getAttribute("seconds");
    %>
    <h1 style="color: white; background-color: green;">Result</h1>
    <h2>Age:</h2>
    <h2><%= days %></h2>
    <h2><%= hours %></h2>
    <h2><%= minutes %></h2>
    <h2><%= seconds %></h2>
    <% } %>
</body>
</html>