package com.zhaiyz.jfinal.controller;

import com.jfinal.aop.Before;
import com.jfinal.core.Controller;
import com.zhaiyz.jfinal.interceptor.StudentInterceptor;
import com.zhaiyz.jfinal.model.Student;

import java.util.List;

/**
 * Created by zhaiyz on 15-12-13.
 */
public class StudentController extends Controller {

    @Before(StudentInterceptor.class)
    public void index() {
        List<Student> students = Student.DAO.find("select * from student");
        setAttr("students", students);
        renderFreeMarker("/template/index.ftl");
    }

    public void add() {
        renderFreeMarker("/template/student_add.ftl");
}

    public void delete() {
        Student.DAO.deleteById(getParaToInt());
        forwardAction("/student");
    }

    public void update() {
        Student student = getModel(Student.class);
        student.update();
        forwardAction("/student");
    }

    public void get() {
        Student student = Student.DAO.findById(getParaToInt());
        setAttr("student", student);
        renderFreeMarker("/template/student_update.ftl");
    }

    @Before(StudentInterceptor.class)
    public void save() {
        Student student = getModel(Student.class);
        student.save();
        forwardAction("/student");
    }
}
