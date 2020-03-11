package com.infix.qa.javahwthreeeleven;

import java.util.function.DoubleToIntFunction;

public class GetterAndSetter {
    String name;
    int age;

    public static void main(String [] args) {
        GetterAndSetter a = new GetterAndSetter();

        a.setName("Ayaan");
        a.setAge(2);
        System.out.println(a.getAge());
        System.out.println(a.getName());

    }
    // Setter
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    // Getter
    public String getName(){
        return this.name;
    }
    public Integer getAge(){
        return this.age;
    }


}
