package com.tejnal.java.tejnaljavalab.java8.lab;

import com.tejnal.java.tejnaljavalab.fcinterfaces.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class FuncInterfaceExamples {

    public static void predicateExample() {

        Predicate<Person> person = (p) -> p.getAge() > 25;
        boolean result = person.test(new Person("Niki", 34));
        System.out.println(result);

    }

    public static void functionExample() {

        Function<Integer, Double> centigradeToFahrenheitInt = x-> (double) ((x * 9 / 5) + 32);
        System.out.println( "Temperature : " + centigradeToFahrenheitInt.apply(25));

    }

    public static void supplierExample() {
        Supplier<Person> supplier = () -> {
            return new Person("migahel", 23);
        };

        System.out.printf("New customer age: %s%n", supplier.get().getAge());

    }

    public static void consumerExample() {

        List<Person> customers = new ArrayList<Person>();
         customers.add(new Person("johny", 27));
         customers.add(new Person("Mnany", 45));
         customers.add(new Person("sanjay", 34));
         customers.add(new Person("Jwala", 39));

         Consumer<Person> consumer = p -> {
             System.out.println(p.getName());
            System.out.println(p.getAge());

         };
         consumer.accept(new Person("janki", 45));

        System.out.println("display : " + customers.size());
    }

    public static void biConsumerExample() {
        BiConsumer<Person, Person> biConsumer = (p1, p2) -> {
            System.out.println(" print first persion");
            System.out.println(p1.getName());
            System.out.println(" print second persion");
            System.out.println(p2.getName());
        };

        biConsumer.accept(new Person("Salar", 10), new Person("ram", 10));

    }

    public static void biPredicateDemo(){

        // Lambda expression implementation
        BiPredicate < String, String > biPredicate = (s1, s2) -> s1.equals(s2);
        System.out.println(biPredicate.test("tej", "tej"));


    }


}
