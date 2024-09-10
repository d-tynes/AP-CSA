//Problem Set 1A - Haiku
//Dahlia Tynes
//09/09/2024

import java.util.Scanner;

public class Questions {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Hello! What's your name?");
        String name = input.nextLine();
        
        System.out.print("What's your favourite course right now?");
        String favClass = input.nextLine();
        
        System.out.print("How many hours per week do you spend studying?");
        double studyTime = input.nextDouble();
        
        System.out.print("That sucks. How much time do you spend on your phone?");
        double phoneTime = input.nextDouble();
        
        System.out.println("Summary:");
        System.out.println ("Your favourite course is "+ favClass);
        if(phoneTime>studyTime){
            System.out.println("You spend "+(phoneTime-studyTime)+ " more hours on your phone than on your homework.");
            System.out.println("...");
            System.out.print("same tbh");
        }
        if ((phoneTime-studyTime)<0){
            System.out.println("You spend "+(studyTime-phoneTime)+" more hours studying than on your phone.");
            System.out.println("Damn");
            }  
        if(phoneTime==studyTime){
                System.out.println("You spend the same amount of time studying as you do on your phone.");
                System.out.println("I respect that.");
            }
            
        }
        
    }

