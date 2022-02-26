package com.company.service;

import com.company.Student;

import java.util.ArrayList;

public class StudentManager {

    ArrayList<Student> studentList = new ArrayList<Student>();

    public boolean addStudent(Student student) {
        if (!checkStudentExist(student.getId())) {
            studentList.add(student);

            System.out.println("Student added: " + student.getName() + " " + student.getLastName());
            return true;
        }
        System.out.println("Student exist.");
        return false;
    }

    private boolean checkStudentExist(int id) {
        for (Student student : studentList) {
            if (student.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public boolean deleteStudent(int id) {
        for (Student student : studentList) {
            if (student.getId() == id) {
                studentList.remove(student);

                System.out.println("Student with id: " + id + " has deleted.");
                return true;
            }
        }
        System.out.println("Student with id: " + id + " has not found.");
        return false;
    }

    public boolean updateStudent(Student tempStudent) {
        for (Student student : studentList) {
            if (tempStudent.getId() == student.getId()) {
                student.setIdentityNumber(tempStudent.getIdentityNumber());
                student.setName(tempStudent.getName());
                student.setLastName(tempStudent.getLastName());

                System.out.println("Student with id: " + student.getId() + " has updated.");
                return true;
            }
        }
        System.out.println("Student with id: " + tempStudent.getId() + " has not found.");
        return false;
    }

    public ArrayList<Student> getAllStudents() {
        return this.studentList;
    }

    public void printAllStudents(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println("ID: " + student.getId() +
                    " Identity Number: " + student.getIdentityNumber() +
                    " Name: " + student.getName() +
                    " Last Name: " + student.getLastName()
            );
        }
    }
}
