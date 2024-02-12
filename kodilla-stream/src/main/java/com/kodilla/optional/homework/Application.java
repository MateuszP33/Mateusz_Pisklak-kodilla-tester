package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Teacher teacher1 = new Teacher("Karol Kowalski");
        Teacher teacher2 = null;
        Teacher teacher3 = new Teacher("Julia Juliańska");
        students.add(new Student("Jan Janowski", teacher1));
        students.add(new Student("Franciszek Frankowski", teacher2));
        students.add(new Student("Anna Antkiewicz", teacher3));
        students.add(new Student("Karol Chodkiewicz", teacher2));
        students.add(new Student("John Johnson", teacher1));
        for (Student student : students) {
            Student student1 = studentOptimal(student);
            System.out.println("Student: " + student1.getTeacher() + "Teacher: " + student1.getTeacher().getName());
        }

    }
    public static Student studentOptimal(Student student) {
        Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
        String teacherName = optionalTeacher.orElse(new Teacher("<undefined>")).getName();
        Student newStudent = new Student(student.getName(), new Teacher(teacherName));
        return newStudent;
    }
}