<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>


<c:forEach var="whiproundSum" items="${whiproundSums}">
    <tr>
        <td>${whiproundSum.whipround.description}</td>
        <td>Goal: ${whiproundSum.whipround.goal}</td>
        <td>Percentage: ${whiproundSum.percentage}</td>
        <td><a href="/whipround/${whiproundSum.whipround.id}">Donate</a></td>

    </tr><br>
</c:forEach>


</body>
</html>