# Java-Servlets
Getting up to speed with java servelet => Sunday Project

This is a JEE6 Web application i.e Java Platform Enterprise edition

This project will use this technology(java servlets) to build web application

For complete documentation on java EE6  Go to oracle website for documentation

Other features of java EE are 
    - Java Servlets Technology (JSF)
    - Java Persistence API (JPA)
    - Java Transaction API (JTA)
    - Java APII For Restful Web Services (JAR-WS)
    - Java Database Connectivity (JDBC)
    - Java Messaging Service (JMS)
    - etc


Servlet - Is a very simple java class which can take a request in and can respond using a response

-> The browser sends http request to the web server
-> Web server responds with a http response

-> while creating a servelet, it should extend HttpServlet

-> Annotations are soething that add more information to a class

-> Java code can be written in JSP using scriplets

```
<% 
System.out.println("Testing_Scriplets " + request.getParameter("name")); 
Date now = new Date();
%>

<div> Current date is  <%=now%></div>

```

-> Scriplets form expression language
-> Scrplets are not recomended in any real world applications



# To Buils and run the project
    - Maven build (tomacat7:run)
    - Open localhost 8080 on browser
