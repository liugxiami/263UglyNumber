package com.ccsi;

public class Main {

    public static void main(String[] args) {
	    int n=14;
        System.out.println(isUgly(n));
    }
    //Write a program to check whether a given number is an ugly number.
    //Ugly numbers are positive numbers whose prime factors only include 2,3,5.
    //Note that 1 is typically treated as an ugly number.
    public static boolean isUgly(int num){
        if(num==1) return true;
        int[] primes={2,3,5};
        for (int i = 0; i < primes.length; i++) {
            while(num%primes[i]==0) num/=primes[i];
        }
        return num==1;
    }
}
