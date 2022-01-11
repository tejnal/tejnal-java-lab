package com.tejnal.java.tejnaljavalab.fcinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @project tejnal-java-lab
 * @autor tejnal on 2020-07-15
 */
public class PracticeConsumerFunc {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 5, 59, 89);

        Consumer<Integer> consumer = x  -> System.out.println(x);
        forEach(list, consumer);

        List<String> lis1 = Arrays.asList("a", "abc", "abcd","uiiiiiu" );
        Consumer<String>  cosumer1 = x -> System.out.println(x);
        forEach(lis1, cosumer1);



     }

     static <T> void forEach(List<T> list, Consumer<T> consumer) {
            for(T t : list) {
                consumer.andThen(consumer).accept(t);

            }
    }
}
