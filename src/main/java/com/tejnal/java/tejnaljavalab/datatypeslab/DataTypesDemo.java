package com.tejnal.java.tejnaljavalab.datatypeslab;


public class DataTypesDemo {

    public void studentInfo(String name, int age, int... marks ){
        System.out.println("Name: " + name );
        System.out.println("Age: " + age);
        System.out.println("Marks: "  );

        for(int m: marks) {
            System.out.println(m + "");
        }


    }
}
