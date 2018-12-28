<%@ page import="com.LibBookCo.BookLibrary.controller.requestcontroller.RequestController" %>
<!DOCTYPE html>
<html lang="en-US">
<head>
    <title>Admin Page</title>
    <meta charset="UTF-8">
</head>
<body style="background-color:#6ab79e;">
<div style="padding-bottom: 2rem;padding-left: 2rem;
			margin-bottom: 1rem;background-color: #99ff60;border-radius:1rem;border:2px solid #999999;
			box-sizing: border-box;
			font-family:-apple-system,BlinkMacSystemFont,'Segoe UI',Roboto,'Helvetica Neue',Arial,sans-serif,'Apple Color Emoji','Segoe UI Emoji','Segoe UI Symbol','Noto Color Emoji';
			font-size: 1rem;font-weight: 400;line-height: 1.5;color: #212529;">
    <h2>Admin Page</h2>

    <p>You can Add/Search/Delete books in this page.</p>
</div>

<div style="background-color: #bad2fc;min-width: 1000px;width: 80%;
padding-right: 5%;padding-left: 5%;margin-right: 5%;margin-left: 5%;border:2px solid #999999;
border-radius:0.5rem;
font-family: -apple-system,BlinkMacSystemFont,'Segoe UI',Roboto,'Helvetica Neue',Arial,sans-serif,'Apple Color Emoji','Segoe UI Emoji','Segoe UI Symbol','Noto Color Emoji';
font-size: 1rem;line-height: 1.5;color: #212529;">
    <div style="display: flex;">
        <div style="width:30%;border:2px solid #999999;background-color:#00c3ff;padding: 30px;margin: 15px;border-radius:0.5rem;">
            <h4>Add Contact</h4>

            <form action="Admin.jsp" method="GET" >
                Book Name:<br/><input type="text" name="book_name" style="width:90%;"/><br/>
                Author:<br/><input type="text" name="author" style="width:90%;"/><br/>
                ISBN:<br/><input type="text" name="isbn" style="width:90%;"/><br/>
                <button type="submit" value="add" name="method" style="margin-top: 15px;
						margin-top: 15px;width: 7rem;background-color: #aaaaaa;padding: 5px;border-radius: 4px;font-weight: bold;box-shadow: 0 2px 4px rgba(0,0,0,0.2);">
                    Add
                </button>
            </form>
        </div>
        <div style="width:30%;border:2px solid #999999;background-color:#ff8888;padding: 30px;margin: 15px;border-radius:0.5rem;">
            <h4>Search Contact</h4>

            <form action="Admin.jsp" method="GET">
                Book Name:<br/><input type="text" name="book_name" style="width:90%;"/><br/>
                Author:<br/><input type="text" name="author" style="width:90%;"/><br/>
                ISBN:<br/><input type="text" name="isbn" style="width:90%;"/><br/>
                <button type="submit" value="search" name="method" style="margin-top: 15px;
						margin-top: 15px;width: 7rem;background-color: #aaaaaa;padding: 5px;border-radius: 4px;font-weight: bold;box-shadow: 0 2px 4px rgba(0,0,0,0.2);">
                    Search
                </button>
            </form>
        </div>
    </div>
    <div style="display: flex;">
        <div style="flex: 50%;border:2px solid #999999;padding:1rem;margin:1rem;background-color:#00c3ff;border-radius:0.5rem;">
            <%new RequestController(request)%>
            <table style="width:100%" border="1">
                <tr>
                    <th>ID</th>
                    <th>Book Name</th>
                    <th>Author</th>
                    <th>ISBN</th>
                </tr>
                <tr>
                    <td>1</td>
                    <td>Jill</td>
                    <td>Smith</td>
                    <td>50</td>
                </tr>
                <tr>
                    <td>2</td>
                    <td>Eve</td>
                    <td>Jackson</td>
                    <td>94</td>
                </tr>
            </table>
            <h3>Search Result</h3>
            <p>test</p>
            <p>..</p>
        </div>
    </div>
</div>
</body>
</html>
