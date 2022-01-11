package com.tejnal.java.tejnaljavalab.topics.fucntionalprog;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @project tejnal-java-lab
 * @autor tejnal on 2020-05-11
 */
public class FunctionalProgrammingDemo {

    public void checkFunctionalProgramming() {
        List<String> list = List.of("Aus","Ind", "Nz");
        printWithFP(list);
        printWithFPWithFilters(list);
        convertTeamsIntoLowerCase(list);

    }

    private static  void printWithFP(List<String> list) {
        list.stream().forEach( element -> System.out.println(element));
    }


    private static  void printWithFPWithFilters(List<String> list) {
        list.stream().
                filter( element -> element.endsWith("at"))
                .forEach(
                element -> System.out.println(element)
        );
    }


    public void checkFunctionalProgrammingForInteger() {
        List<Integer> numbers = List.of(7,10,90, 34,56, 89, 76,90, 80, 80);
        getSum(numbers);
        getSumOfOddNumbers(numbers);
        printUsingFp(numbers);
        printUsingFpWithFilters(numbers);

        verifySortOperation(numbers);
        SortdistinctOperation(numbers);
        distinctSortOperation(numbers);
        distinctAndSqaureOperation(numbers);

        sqaureOfFirsTenNumbers();
        compareOfInteger(numbers);

        getListOfOddNumbers(numbers);

    }

    private void getSum(List<Integer> numbers) {
        int sum  = numbers.stream()
                .reduce(0, (number1, number2 )-> number1 + number2);
        System.out.println("Total sum : " + sum);
    }

    private void compareOfInteger(List<Integer> numbers) {
        System.out.println("Compare for max numbers");
        var number = numbers.stream()
        .max(Integer::compare).get();
        System.out.println(number);

    }

    private void getSumOfOddNumbers(List<Integer> numbers) {
        int sum  = numbers.stream()
                .filter(element -> element%2 ==1)
                .reduce(0, (number1, number2 )-> number1 + number2);
        System.out.println("Total sum of Odd Numbers : " + sum);
    }

    private void getListOfOddNumbers(List<Integer> numbers) {

        System.out.println("Print Odd Numbers in List");
        numbers.stream().filter(element -> element%2 == 1)
                .collect(Collectors.toList());
    }

    private void printUsingFp(List<Integer> numbers) {
        numbers.stream().forEach( element -> System.out.println(element));
    }


    private void printUsingFpWithFilters(List<Integer> numbers) {
        numbers.stream()
                .filter(element -> element%2 == 1)
                .forEach( element -> System.out.println(element));
    }


    private void verifySortOperation(List<Integer> numbers) {
        System.out.println("Sorted operation ");
        numbers.stream().sorted().forEach(e-> System.out.println(e) );

    }

    private void SortdistinctOperation(List<Integer> numbers) {
        System.out.println("Sort and distinct ");
        numbers.stream().sorted().distinct().forEach(System.out::println);

    }

    private void distinctSortOperation(List<Integer> numbers) {
        System.out.println("distinct and sort ");
        numbers.stream().distinct().sorted().forEach(System.out::println);

    }



    private void distinctAndSqaureOperation(List<Integer> numbers) {
        System.out.println("distinct & sort ");
        numbers.stream().distinct().sorted()
                .map(e -> e * e)
                .forEach(System.out::println);

    }

    private void sqaureOfFirsTenNumbers(){
        System.out.println("Square of first ten numbers");
        IntStream.range(1, 10).map(e -> e * e ).forEach(e -> System.out.println( e + " "));

    }

    private void convertTeamsIntoLowerCase(List<String> list) {
        System.out.println("Convert teams in to lower case");
        list.stream().sorted().map(e-> e.length()).forEach( e -> System.out.println( e + " "));

    }

}
