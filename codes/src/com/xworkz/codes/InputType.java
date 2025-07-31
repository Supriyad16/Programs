package com.xworkz.codes;

import java.util.Scanner;

public class InputType {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Take all inputs
        int a = in.nextInt();
        float b = in.nextFloat();
        long c = in.nextLong();
        byte d = in.nextByte();
        String s = in.next();
        String s1 = in.next();

        // Print all the values

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.print(s+" ");
        System.out.print(s1+" ");
        System.out.print(s);

    }
}
