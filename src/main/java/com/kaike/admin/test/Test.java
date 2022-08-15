package com.kaike.admin.test;

public class Test {

    public static void main(String[] args) {

        for (int i=0; i<=20000; i++) {
            System.out.println("insert into test values("+i+",'name"+i+"');");
        }
    }

}