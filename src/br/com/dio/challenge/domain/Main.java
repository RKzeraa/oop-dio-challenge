package br.com.dio.challenge.domain;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Course course1 = new Course();
        course1.setTitle("Java Course");
        course1.setDescription("Java Course Description");
        course1.setHourlyLoad(8);

        Course course2 = new Course();
        course2.setTitle("C# Course");
        course2.setDescription("C# Course Description");
        course2.setHourlyLoad(8);

        Mentorship mentorship = new Mentorship();
        mentorship.setTitle("Java Mentorship");
        mentorship.setDescription("Java Mentorship Description");
        mentorship.setDate(LocalDate.now());

        System.out.println(course1);
        System.out.println(course2);
        System.out.println(mentorship);
    }
}
