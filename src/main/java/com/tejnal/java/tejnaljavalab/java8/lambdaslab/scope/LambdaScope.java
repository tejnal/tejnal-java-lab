package com.tejnal.java.tejnaljavalab.java8.lambdaslab.scope;

/**
 * @project tejnal-java-lab
 * @autor tejnal on 2020-07-01
 */
public class LambdaScope extends SuperScope {
    private String member = "GRANDPA";

    interface  Family {
        String who(String number);

    }

    public void testMember(String member) {
        System.out.println("local member:" + member);
        System.out.println("Family member " + this.member);
        System.out.println("Family member " + super.member );

        Family familyNumber = (fm) -> {
            System.out.println("local member:" + fm);
            System.out.println("local member:" + member);
            System.out.println("Family member " + this.member);
            System.out.println("Family member " + super.member );
            return fm;
        };

        System.out.println("Print family number" + familyNumber.who(member));
    }

    public static void main(String[] args ) {
        new LambdaScope().testMember("SON");
    }

}
