package main;

import exam.ExamRating;
import exam.Levels;

public class Main {

    public static void main(String[] args) {

        System.out.println("Before any instantiation: " +
                ClassCounter.getInstantiationCount());

        ClassCounter cc1 = new ClassCounter();
        ClassCounter cc2 = new ClassCounter();


        System.out.println("After two instantiation: " +
                ClassCounter.getInstantiationCount());


        ClassCounter cc3 = new ClassCounter();
        ClassCounter cc4 = new ClassCounter();


        System.out.println("After four instantiation: " +
                ClassCounter.getInstantiationCount());

        System.out.println(ClassCounter.callMethodCount()); // 0
        System.out.println(ClassCounter.callMethodCount());
        System.out.println(ClassCounter.callMethodCount());

        ExamRating er = new ExamRating();

        System.out.println("My Result: " + er.getRating(30, Levels.BASIC));
        System.out.println("My Result: " + er.getRating(90, Levels.MID));

        // A diff nem lehet konstans mivel legalább 2 értéket is adtunk neki.
    }
}
