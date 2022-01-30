package com.tejnal.java.tejnaljavalab.conditionalloops;

public class ConditionalLoopsLab {

   static final  int[] left = {5,9,10};
    static final int[] right = {19,10, 25};
    static int iVal = 0;

    static final int[][] multi = {{100, 106,109},
            {201, 206, 209},
            {302, 306, 309}


    };

    public static void demoArraysForLoop() {
         for(int i =0, j= right.length-1; i < left.length; i++ , j -- ){
             int result = left[i] + right[j];

             System.out.println("result =  " + result);
         }

    }


    public static void doNestedArrayLoop() {
        for(int i =0; i < multi.length; i++)
            for(int j =0; j < multi[i].length; j++)
                System.out.println(multi[i][j]);
    }

    public static void nestedForEachLoop() {
        for ( int[] simple : multi)
            for( int value :simple)
                System.out.println(value);
    }


    public static void demoContinueStatement(){
        while(iVal < 10 ) {
            iVal++;
            if(iVal % 2 == 0)
                continue;
            System.out.println(iVal);

        }
    }





}
