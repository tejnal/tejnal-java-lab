package com.tejnal.java.tejnaljavalab.java8.lambdaslab.mreference;

/**
 * @project tejnal-java-lab
 * @autor tejnal on 2020-07-01
 */
public class MethodReferences {

    interface IMovie {
        public boolean check(int id);
    }

    public void testMovieStaticMethodRef() {
        IMovie m1 = (i ) -> i <100 ? true:false;
        IMovie m2 = MethodReferences::isClassic;
        System.out.println(m1.getClass());
        System.out.println( m2);

    }

    public static boolean isClassic(int movieId) {
        return true;
    }

    public static void main(String[] args) {
        MethodReferences client = new MethodReferences();
        client.testMovieStaticMethodRef();
    }
}
