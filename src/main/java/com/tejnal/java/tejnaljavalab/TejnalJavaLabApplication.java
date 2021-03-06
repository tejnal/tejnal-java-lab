package com.tejnal.java.tejnaljavalab;

import com.tejnal.java.tejnaljavalab.annotations.MyCustomAnnotation;
import com.tejnal.java.tejnaljavalab.annotations.UseCustomAnnotation;
import com.tejnal.java.tejnaljavalab.collectionslab.CompareMapByKeys;
import com.tejnal.java.tejnaljavalab.conditionalloops.ConditionalLoopsLab;
import com.tejnal.java.tejnaljavalab.datatypeslab.DataTypesDemo;
import com.tejnal.java.tejnaljavalab.enumeration.Color;
import com.tejnal.java.tejnaljavalab.java8.lab.Average;
import com.tejnal.java.tejnaljavalab.java8.lab.FuncInterfaceExamples;
import com.tejnal.java.tejnaljavalab.java8.lab.LambdaExamples;
import com.tejnal.java.tejnaljavalab.oopslab.candbdemo.FlightPlan;
import com.tejnal.java.tejnaljavalab.serializationd.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.Condition;

@SpringBootApplication
public class TejnalJavaLabApplication {

    public static void main(String[] args) throws NoSuchMethodException {
        SpringApplication.run(TejnalJavaLabApplication.class, args);

        demoEnumeration();

        demoCustomAnnotation();

        demoSerialization();

        CompareMapByKeys compareMapByKeys = new CompareMapByKeys();
        compareMapByKeys.clientMap();
        varagsExamples();

        //lambda example
        lambdaExample();

        //sort a list compare by age
        LambdaExamples.comparatorExampleWithLambda();

        LambdaExamples.forEachExampleWithLambdaExample();

        //iterate HashMap
        LambdaExamples.iterateHashMapWithLambda();

        // predicate example
        FuncInterfaceExamples.predicateExample();

        // functional interface
        FuncInterfaceExamples.functionExample();

        //supplier LambdaExamples
        FuncInterfaceExamples.supplierExample();

        //consumer example
        FuncInterfaceExamples.consumerExample();

        //biconsumer example
        FuncInterfaceExamples.biConsumerExample();

        //bipredicate example
        FuncInterfaceExamples.biPredicateDemo();

        // Conditional loops

        ConditionalLoopsLab.demoArraysForLoop();

        ConditionalLoopsLab.doNestedArrayLoop();

        ConditionalLoopsLab.nestedForEachLoop();

        ConditionalLoopsLab.demoContinueStatement();

        // class and objets
        // Partial flight plan
        FlightPlan berlinToBucharest = new FlightPlan(
                "BER",
                "OTP"
        );
        berlinToBucharest.print();

        System.out.println();

        // Complete flight plan
        FlightPlan parisToLondon = new FlightPlan(
                "CDG",
                "LHR",
                LocalDateTime.of(2020, 01, 10, 23, 15),
                List.of("CDG", "FARAR", "BAYKA", "DUDES", "LHR")
        );
        parisToLondon.print();

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


    public static void varagsExamples() {
        DataTypesDemo dataTypesDemo = new DataTypesDemo();
        dataTypesDemo.studentInfo("mike", 24, 89,90,92,95);
        dataTypesDemo.studentInfo("charlie ", 27, 78,92,69,89);
        dataTypesDemo.studentInfo("Intu", 31, 90,78,88,90);


    }

    public static void lambdaExample() {
       Average withLambda = (lambdaArray)-> {

           double sum= 0;
           int arraySize = lambdaArray.length;

           System.out.println("arraySize: " + arraySize);

           for(int i=0; i < lambdaArray.length; i++){
               sum = sum + lambdaArray[i];
           }
           System.out.println("sum : " + sum);

           return (sum/arraySize);

       };

       int[] lambdaArray = {4, 8, 5, 9, 8};
        System.out.println(withLambda.avg(lambdaArray));
    }




}
