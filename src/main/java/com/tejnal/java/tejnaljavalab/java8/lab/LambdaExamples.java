package com.tejnal.java.tejnaljavalab.java8.lab;


import com.tejnal.java.tejnaljavalab.fcinterfaces.model.Person;

import java.util.*;

public class LambdaExamples {

   static  List<Person> people = new ArrayList<>();


    public static void comparatorExampleWithLambda() {
        people.add(new Person("surya", 32));
        people.add(new Person("raj", 24));
        people.add(new Person("saghu", 35));
        people.add(new Person("mike", 43));

        //without lambda

        Comparator<Person> compare = new Comparator<Person>() {


            @Override
            public int compare(Person p1, Person p2) {
                return p1.getAge() - p2.getAge();
            }
        };

        Collections.sort(people, compare);

        //with lambda
      Collections.sort(people, (p1, p2)->
      {
          return p1.getAge() - p2.getAge();

      });

      // solution using comparingInt
        Collections.sort(people,  Comparator.comparingInt(Person::getAge));

    }

    public static void forEachExampleWithLambdaExample(){

        List<String> languages = Arrays.asList("java", "python", "ruby", "pascal", "scale", "javascript");

        System.out.println("solution 1 : " );

        // stream through list using forEach
        languages.stream().sorted().forEach(course -> printCourse(course));

        System.out.println("solution 2 : " );
        //Stream through list using methodReference
        languages.stream().forEach(LambdaExamples::printCourse);

        System.out.println("solution 3 : " );
        //java8 forEach
        languages.forEach(LambdaExamples::printCourse);

        System.out.println("solution 4 : " );
        //java8 forEach
        languages.forEach(course -> printCourse(course));

    }

    public static void iterateHashMapWithLambda() {

        Map<Integer, String> roleMap = new HashMap<Integer, String>();
        roleMap.put(1, "qa");
        roleMap.put(2, "dev");
        roleMap.put(3, "devops");
        roleMap.put(4, "dbadmin");
        roleMap.put(5, "netwrok");
        roleMap.put(6, "cloud");

        roleMap.forEach((k,v) -> coursePrinter(k,v));

        roleMap.forEach(LambdaExamples::coursePrinter);


    }

    private static void printCourse(String course){
        System.out.println("Course name :: " + course);

    }

    private static void coursePrinter(Integer id, String role) {
        System.out.println("Role id : " + id + " role name : " + role );
    }


}
