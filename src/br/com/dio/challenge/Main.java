package br.com.dio.challenge;

import br.com.dio.challenge.domain.*;

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

        /*System.out.println(course1);
        System.out.println(course2);
        System.out.println(mentorship);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Description Bootcamp Java Developer");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentorship);

        Dev devRamom = new Dev();
        devRamom.setName("Ramom");
        devRamom.subscribedBootcamp(bootcamp);
        System.out.println("Subscribed Contents Ramom" + devRamom.getSubscribedContents());
        devRamom.progress();
        devRamom.progress();
        System.out.println("_");
        System.out.println("Subscribed Contents Ramom" + devRamom.getSubscribedContents());
        System.out.println("Finished Contents Ramom" + devRamom.getFinishedContents());
        System.out.println("XP:" + devRamom.calculateTotalXp());

        System.out.println("________________________________");

        Dev devRize = new Dev();
        devRize.setName("Rize");
        devRize.subscribedBootcamp(bootcamp);
        System.out.println("Subscribed Contents Rize" + devRize.getSubscribedContents());
        devRize.progress();
        devRize.progress();
        devRize.progress();
        System.out.println("_");
        System.out.println("Subscribed Contents Rize" + devRize.getSubscribedContents());
        System.out.println("Finished Contents Rize" + devRamom.getFinishedContents());
        System.out.println("XP:" + devRize.calculateTotalXp());
    }
}
