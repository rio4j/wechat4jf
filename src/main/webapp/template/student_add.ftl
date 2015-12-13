<!DOCTYPE HTML>
<html>
    <head>
        <title>添加学生</title>
        <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    </head>

    <body>
        <form action="/save" method="post">
            姓名：
            <input type="text" name="student.name" />
            <br />
            年龄：
            <input type="text" name="student.age" />
            <br />
            <input type="submit" value="保存" />
        </form>
    </body>
</html>