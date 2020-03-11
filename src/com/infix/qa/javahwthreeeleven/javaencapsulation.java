package com.infix.qa.javahwthreeeleven;

public class javaencapsulation {

    public static void main (String [] args){
        Encapsulation a= new Encapsulation ();
        a.SetName("Ayaan");
        a.SetAge(2);

        System.out.println(a.getName());
        System.out.println(a.getAge());

    }
}
