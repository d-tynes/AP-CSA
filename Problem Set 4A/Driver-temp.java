//
import java.util.Scanner;
public class Driver{
    public static void main (String[]args){
        GuessNumber();

    }  
    public static void GuessNumber(){
        Scanner input=new Scanner(System.in);
        System.out.print("Pick a number between 1 and 100");
        System.out.print("Your guess:");
        int a =input.nextInt();
        int ans = (int) Math.random()*100+1;
        int tries=0;
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

