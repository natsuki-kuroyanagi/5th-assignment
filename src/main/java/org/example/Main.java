package org.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1,20,"ジョン");
        Student student2 = new Student(2,21,"マイケル");
        Student student3 = new Student(3,22,"ジャッジ");



        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,20,"ジョン"));
        studentList.add(new Student(2,21,"マイケル"));
        studentList.add(new Student(3,22,"ジャッジ"));

        /* 　Numberが2以下の人を表示する */
        studentList.stream().filter(student -> student.getNumber() <= 2).forEach(student -> System.out.println(student.getName()));
       }
    }








