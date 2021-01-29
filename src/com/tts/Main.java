//
//package com.tts;
//
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
//
//public class Main {
//
////    public static void main(String[] args) {
////        int myArray[] = {7, 3, 12, 9, 15};
////        int sum = 0;
////        for (int num : myArray) {
////            sum = sum + num;
////        }
////        System.out.println("The sum of this array is: " + sum);
//
//    public static void main(String[] args) {
//        List<Integer> myArr = new ArrayList<>();
//        Scanner whatNum = new Scanner(System.in);
//        toPower(4, 2);
//        System.out.println("Please enter 5 numbers:");
//        System.out.println(Arrays.toString(toPower(4, 2)));
//
//
//    }
//}

package com.tts;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        List<Integer> myArr = new ArrayList<>();
        Scanner whatNum = new Scanner(System.in);
        toPower(4, 2);
        System.out.println("Please enter 5 numbers:");
        System.out.println(Arrays.toString(toPower(4, 2)));



        int num = 0;
        for (int i = 0; i <= 4; i++) {

            num = Integer.parseInt(whatNum.nextLine());
            myArr.add(num);

//            System.out.println(myArr);
//            myArr.add(whatNum.nextInt());
        }

        int sum = 0;
//        System.out.println(myArr);
        for (int i : myArr) {
            sum = sum + i;
//            System.out.println(sum);


        }
        System.out.println("the sum is " + sum);



    }


    public static int[] toPower(int size, int power) {

        int[] myIntArray = new int[size];
        for(int i = 0; i < size; i++){
            int indexToPower = (int) Math.pow(i, power);
            myIntArray[i] = indexToPower;


        }
        return myIntArray;

    }


}

