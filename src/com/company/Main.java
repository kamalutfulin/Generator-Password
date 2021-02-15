package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Сколько символов будет в пароле?");
        try {
            Integer inputNumber = Integer.parseInt(bufferedReader.readLine());
            ArrayList<String> password = new ArrayList<>();
            int lastHashmap = 0;
            HashMap<Integer, String> numbers = new HashMap<>();
            numbers.put(0, "0");
            numbers.put(1, "1");
            numbers.put(2, "2");
            numbers.put(3, "3");
            numbers.put(4, "4");
            numbers.put(5, "5");
            numbers.put(6, "6");
            numbers.put(7, "6");
            numbers.put(8, "8");
            numbers.put(9, "9");

            HashMap<Integer, String> capitalLetters = new HashMap<>();
            capitalLetters.put(0, "A");
            capitalLetters.put(1, "B");
            capitalLetters.put(2, "C");
            capitalLetters.put(3, "D");
            capitalLetters.put(4, "E");
            capitalLetters.put(5, "F");
            capitalLetters.put(6, "G");
            capitalLetters.put(7, "K");
            capitalLetters.put(8, "L");
            capitalLetters.put(9, "W");


            HashMap<Integer, String> littleLetters = new HashMap<>();
            littleLetters.put(0, "y");
            littleLetters.put(1, "x");
            littleLetters.put(2, "o");
            littleLetters.put(3, "n");
            littleLetters.put(4, "m");
            littleLetters.put(5, "i");
            littleLetters.put(6, "z");
            littleLetters.put(7, "j");
            littleLetters.put(8, "p");
            littleLetters.put(9, "r");

            HashMap<Integer, String> specialSimbols = new HashMap<>();
            specialSimbols.put(0, "!");
            specialSimbols.put(1, "@");
            specialSimbols.put(2, "#");
            specialSimbols.put(3, "$");
            specialSimbols.put(4, "%");
            specialSimbols.put(5, "^");
            specialSimbols.put(6, "&");
            specialSimbols.put(7, "*");
            specialSimbols.put(8, ">");
            specialSimbols.put(9, "?");


            for (int i = 0; i < inputNumber; i++) {
                int current = random(1, 5);
                if (lastHashmap == current) {
                    i--;
                } else if (current == 1 && lastHashmap != 1) {
                    password.add(i, numbers.get(random(1, 10)));
                    lastHashmap = 1;
                } else if (current == 2 && lastHashmap != 2) {
                    password.add(i, capitalLetters.get(random(1, 10)));
                    lastHashmap = 2;
                } else if (current == 3 && lastHashmap != 3) {
                    password.add(i, littleLetters.get(random(1, 10)));
                    lastHashmap = 3;
                } else if (current == 4 && lastHashmap != 4) {
                    password.add(i, specialSimbols.get(random(1, 10)));
                    lastHashmap = 4;
                }
            }
            StringBuilder sb = new StringBuilder();
            for (Object o : password)
                sb.append(o);
            String res = sb.toString();
            System.out.println(res);


        } catch (NumberFormatException exception) {
            System.out.println("Введите число");
        }

    }


    public static int random(int a, int b) {
        int random = (int) (Math.random() * (b - a) + a);
        return random;
    }

}









