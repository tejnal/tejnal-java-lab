package com.tejnal.java.tejnaljavalab;

import com.tejnal.java.tejnaljavalab.annotations.MyCustomAnnotation;
import com.tejnal.java.tejnaljavalab.annotations.UseCustomAnnotation;
import com.tejnal.java.tejnaljavalab.enumeration.Color;
import com.tejnal.java.tejnaljavalab.serializationd.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.lang.reflect.Method;
import java.util.Arrays;

@SpringBootApplication
public class TejnalJavaLabApplication {

    public static void main(String[] args) throws NoSuchMethodException {
        SpringApplication.run(TejnalJavaLabApplication.class, args);

        demoEnumeration();

        demoCustomAnnotation();

        demoSerialization();
    }

    //enumeration demo
    public static void demoEnumeration() {
        Color color = Color.GREEN;
        System.out.println("Color: " + color);

        // after java 8
        Arrays.stream(Color.values()).map(display -> "Display: " + display).forEach(System.out::println);

        //before Java 8
        for (Color display : Color.values()) {
            System.out.println("Display: " + display.getValue());
        }

    }

    //Custom annotation Demo
    public static void demoCustomAnnotation() throws NoSuchMethodException {

        UseCustomAnnotation useCustomAnnotation = new UseCustomAnnotation();

        Method method = useCustomAnnotation.getClass().getMethod("sayHello");

        MyCustomAnnotation myCustomAnnotation = method.getAnnotation(MyCustomAnnotation.class);
        System.out.println("value is : " + myCustomAnnotation.value());


    }

    // demo Serialization
    public static void demoSerialization() {
        Student student = new Student("Tej", "31", "23 victor street, stockholm");

        // get file from classpath
        File file = new File(
                TejnalJavaLabApplication.class.getClassLoader().getResource("Test.txt").getFile());

        FileOutputStream fileOut;
        ObjectOutputStream objOut;

        try {
            fileOut = new FileOutputStream(file);
            objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(student);

            objOut.close();
            fileOut.close();

            System.out.println("Object has been serilalized: \n" + student);

        } catch (IOException e) {
            System.out.println("IOException is caught");

        }

        //Deserialization

        FileInputStream fileIn;
        ObjectInputStream objIn;

        try {
            fileIn = new FileInputStream(file);
            objIn = new ObjectInputStream(fileIn);

            Student stu = (Student) objIn.readObject();

            System.out.println("Object has been Desrialized: \n " + stu);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(" Exception  is caught");
        }
    }


}
