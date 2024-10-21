//Dahlia Tynes

import java.util.Scanner;
public class Driver{
    public static void main (String[]args){
        DrawGrid d=new DrawGrid();
        d.drawCircles();
    

    }  

    public static void GuessNumber(){

        Scanner input=new Scanner(System.in);
        System.out.println("Pick a number between 1 and 100");
        System.out.println("Your guess:");
        int a =input.nextInt();
        int ans = (int) (Math.random()*100)+1;
        int tries=1;
        while(a!=ans){
            if(a>ans) System.out.println ("too high");
            else if(a<ans) System.out.println ("too low");
            tries++;
            a= input.nextInt();
        }
        if(a==ans){
            System.out.println("You guessed it! It took you "+tries+" tries.");
        }

    }
    
   
}
