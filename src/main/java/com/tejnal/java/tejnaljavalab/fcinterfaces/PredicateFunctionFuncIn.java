package com.tejnal.java.tejnaljavalab.fcinterfaces;


import com.tejnal.java.tejnaljavalab.fcinterfaces.dto.PersonDTO;
import com.tejnal.java.tejnaljavalab.fcinterfaces.model.Person;

import java.util.function.Function;

public class PredicateFunctionFuncIn {

    public static void main(String[] args) {
        Function<Integer, Double> centigradeToFahrenheitInt = s -> Double.valueOf(((s * 9 / 5) + 32));

        //String to integer
        Function<String, Integer> stringToInt = x -> Integer.valueOf(x);
        System.out.println(" String to Int :" + stringToInt.apply("4"));

        Function<Person, PersonDTO> function = e -> new PersonDTO(e.getName(), e.getAge());

        PersonDTO  personDTO = function.apply(new Person("sanjay", 35));
        System.out.println(personDTO.getName());
        System.out.println(personDTO.getAge());



      var values =   Integer.parseInt("098988");

    }
}
