<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
<head>
    <title>Tarantool exec</title>
</head>
<body>

<table>
    <thead></thead>
    <tbody >
        <tr>
            <th>
                Input Lua-code
            </th>
        </tr>
        <tr>
            <td>
                <form method="POST" action="/executeLua">
                    <textarea name="code" cols="40" rows="15"></textarea>
                    <input type="submit" value="Execute" />
                </form>
            </td>
        </tr>
    </tbody>
    <tfoot></tfoot>
</table>

</body>
</html>
