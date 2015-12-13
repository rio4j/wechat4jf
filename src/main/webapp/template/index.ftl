<!DOCTYPE HTML>
<html>
    <head>
        <title>学生列表</title>
        <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    </head>

    <body>
        <a href="/add">添加</a>
        <table border="1">
            <tr>
                <td>
                    姓名
                </td>
                <td>
                    年龄
                </td>
                <td>
                    操作
                </td>
            </tr>
        <#list students as student>
            <tr>
                <td>
                    ${student.name}
                </td>
                <td>
                    ${student.age}
                </td>
                <td>
                    <a href="/student/delete/${student.id}">删除</a>
                    <a href="/student/get/${student.id}">修改</a>
                </td>
            </tr>
        </#list>
        </table>
    </body>
</html>