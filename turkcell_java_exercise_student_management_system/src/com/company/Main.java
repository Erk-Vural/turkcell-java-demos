package com.company;

import com.company.service.StudentManager;

public class Main {

    public static void main(String[] args) {

        StudentManager studentManager = new StudentManager();
        Student student1 = new Student(1, 101, "name1", "lastName1");
        Student student2 = new Student(2, 102, "name2", "lastName2");

        Student tempStudent = new Student(2, 103, "name3", "lastName3");


        studentManager.addStudent(student1);
        studentManager.addStudent(student2);

        studentManager.printAllStudents(studentManager.getAllStudents());

        studentManager.updateStudent(tempStudent);

        studentManager.printAllStudents(studentManager.getAllStudents());

        studentManager.deleteStudent(2);

        studentManager.printAllStudents(studentManager.getAllStudents());
    }

}