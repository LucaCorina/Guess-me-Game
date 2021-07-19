package org.maincode;

import java.util.OptionalInt;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to Wonderland!");
        System.out.println("May I have your name?");

        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();
        System.out.println("Hi "+name);

        System.out.println("Shall we start?");
        System.out.println("\t1 YEea");
        System.out.println("\t2 No Ty");

        int beginAnsw=scanner.nextInt();

        while (beginAnsw!=1){
        System.out.println("Shall we start?");
        System.out.println("\t1 YEea");
        System.out.println("\t2 No Ty");
        beginAnsw=scanner.nextInt();}

        Random random=new Random();
        int x=random.nextInt(20)+1;
        System.out.println("Please Guess your number");
        int user=scanner.nextInt();

        int timeTried=0;
        boolean hasWon=false;
        boolean ShouldFinish=false;

        while (!ShouldFinish){
            timeTried++;
            if(timeTried<5){
                if(user==x){
                    hasWon=true;
                    ShouldFinish=true;
                }
                else if(user>x){
                    System.out.println("Guess lower");
                    user=scanner.nextInt();
                }
                else{
                    System.out.println("Guess higher");
                    user=scanner.nextInt();
                }}
                else{
                    ShouldFinish=true;
                }
            }
        if (hasWon){
            System.out.println("Congratulations! You have guessed in your "+timeTried+" guess.");
        }else{
            System.out.println("Game over! The number was "+x);
        }
        }
    }


