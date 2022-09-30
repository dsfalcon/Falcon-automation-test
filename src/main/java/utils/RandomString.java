package main.java.utils;
// Java program generate a random AlphaNumeric String
// using Math.random() method

import java.util.Random;

public class RandomString {

    public static void main(String[] args) {
        RandomString randomString =new RandomString();
        randomString.getNumber(2);
    }

    // function to generate a random string of length n
    public static String getAlphaNumericString(int n) {

        // chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int) (AlphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }

    public static int generateNumber() {
        Random rand = new Random();
        int rand_int1 = rand.nextInt(100000000);
        System.out.println("Random Integers: " + rand_int1);
        return rand_int1;
    }

    public void getNumber(int x)
    {
        //Random rand = new Random();
        int p = 1;
        for (int i=0; i<x; i++ ){
            p = p*10;

        }
        System.out.println("Total::::"+ p);

    }




}