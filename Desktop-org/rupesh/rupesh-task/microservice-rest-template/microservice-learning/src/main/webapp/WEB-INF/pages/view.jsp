<%-- 
    Document   : viewCustomers
    Created on : 20-Jul-2023, 5:12:25 pm
    Author     : bas200190
--%>


<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.List" %>
<%@page import="com.bassure.khatabook.microservicelearning.model.Customer" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table class="table table-striped table-hover">
            <thead>
                <tr>

                    <th>S.NO</th>
                    <th>Joining Date</th>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Phone Number</th>
                    <th>Debit</th>
                    <th>Gender</th>
                    <th>Age</th>
                    <th>Door No</th>
                    <th>Street Name</th>
                    <th>City</th>
                    <th>Pincode</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <%
                    List<Customer> customers = (List<Customer>) request.getAttribute("listOfCustomers");
                    int index = 1;
                    for (Customer customer : customers) {
                %>
                <tr id="record">
                    <td> <%= index%></td>
                    <td id=<%="date"+customer.getId()%>> <%= customer.getJoiningDateAndTime()%> </td>
                    <td id=<%= "id"+customer.getId()%>> <%=customer.getId()%> </td>
                    <td id=<%= "name"+customer.getId()%>> <%= customer.getName()%> </td>
                    <td id=<%= "phoneno"+customer.getId()%>> <%= customer.getPhoneNo()%> </td>
                    <td id=<%= "debit"+customer.getId()%>> <%= customer.getDebit()%> </td>
                    <td id=<%= "gender"+customer.getId()%>> <%= customer.getGender()%> </td>
                    <td id=<%= "age"+customer.getId()%>> <%= customer.getAge()%> </td>
                    <td id=<%= "doorno"+customer.getId()%>> <%= customer.getAddress().getDoorNo()%> </td>
                    <td id=<%= "streetname"+customer.getId()%>> <%= customer.getAddress().getStreetName()%> </td>
                    <td id=<%= "city"+customer.getId()%>> <%= customer.getAddress().getCity()%> </td>
                    <td id=<%= "pincode"+customer.getId()%>> <%= customer.getAddress().getPincode()%> </td>
                    <td>



                    </td>
                </tr>
                <%
                        index++;
                    }
                %>

            </tbody>
        </table>
    </body>
</html>
