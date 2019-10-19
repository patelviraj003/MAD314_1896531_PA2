package com.example.mad314_1896531_pa2;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private static StudentRepository instance = null;
    private List<Student> students = new ArrayList<>();

    private StudentRepository(){
Student student = new Student();

        student.id = 111;
        student.name = "Kishan";
        student.password ="Kishan123";

        student.id = 112;
        student.name = "Raj";
        student.password ="Raj123";

        student.id = 113;
        student.name = "Suresh";
        student.password ="Suresh123";

        student.id = 114;
        student.name = "Mahesh";
        student.password ="Mahesh123";

        student.id = 115;
        student.name = "Ramesh";
        student.password ="Ramesh123";

        student.id = 116;
        student.name = "Raju";
        student.password ="Raju123";


        student.id = 117;
        student.name = "Karan";
        student.password ="Karan123";

        student.id = 118;
        student.name = "Hitendra";
        student.password ="Hitendra123";

        student.id = 119;
        student.name = "Piyush";
        student.password ="Piyush123";

        student.id = 120;
        student.name = "Vinal";
        student.password ="Vinal123";







        this.students.add(student);
    }

    public static StudentRepository getInstance() {
        if (instance == null) {
            instance = new StudentRepository();
        }
        return instance;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public List<Student> getStudents() {
        return this.students;
    }
}
