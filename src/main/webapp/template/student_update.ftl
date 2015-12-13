<!DOCTYPE HTML>
<html>
    <head>
        <title>学生详情</title>
        <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    </head>

    <body>
        <form action="/student/update" method="post">
            <input type="hidden" name="student.id" value="${student.id}"/>
            姓名：
            <input type="text" name="student.name"  value="${student.name}"/>
            <br />
            年龄：
            <input type="text" name="student.age" value="${student.age}"/>
            <br />
            <input type="submit" value="保存" />
        </form>
    </body>
</html>