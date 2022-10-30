package com.project.javakuppi01;

import java.util.Scanner;

public class FirstClass {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        
        SecondClass object = new SecondClass(name);
        //int number = object.getNumber();
        //System.out.println(number);
        
        object.setAge(12);
        
        int age = object.getAge();
        
        System.out.println("Your name is: " + object.getName());
        
        System.out.println("Your age is: " + object.getAge());
        
        // -------------------------------------------------------------------
        
        Student std1 = new Student("Sunera");
        Student std2 = new Student("Lahiru");
        Student std3 = new Student("Ann");
        Student std4 = new Student("Anjali");
        Student std5 = new Student("Nayani");
        
        std1.setName("Sunilaka");
        
        int[] std1Marks = {56, 78, 56, 89, 34};
        int[] std2Marks = {56, 78, 56, 89, 34};
        int[] std3Marks = {56, 54, 56, 89, 34};
        int[] std4Marks = {56, 78, 90, 89, 34};
        int[] std5Marks = {56, 12, 56, 89, 34};
     
        std1.setMarks(std1Marks);
        std2.setMarks(std2Marks);
        std3.setMarks(std3Marks);
        std4.setMarks(std4Marks);
        std5.setMarks(std5Marks);
        
        System.out.println(std1.getName() + ": " + std1.calculateAverage());
        System.out.println(std2.getName() + ": " + std2.calculateAverage());
        System.out.println(std3.getName() + ": " + std3.calculateAverage());
        System.out.println(std4.getName() + ": " + std4.calculateAverage());
        System.out.println(std5.getName() + ": " + std5.calculateAverage());
        
        
        //---------------------------------------
        
        Car car1 = new Car("vr");
        Car car2 = new Car("br");
        Car car3 = new Car("gr");
        Car car4 = new Car("mr");
        Car car5 = new Car("ar");
        
        car1.setQty(2);
        car2.setQty(4);
        car3.setQty(6);
        car4.setQty(8);
        car5.setQty(10);
        
        System.out.println(car1.getName() + ":" + car1.getQty());
        System.out.println(car2.getName() + ":" + car2.getQty());
        System.out.println(car3.getName() + ":" + car3.getQty());
        System.out.println(car4.getName() + ":" + car4.getQty());
        System.out.println(car5.getName() + ":" + car5.getQty());
    }
    
}
