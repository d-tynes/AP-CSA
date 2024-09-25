//dahlia tynes
//25/09/2024
//APCSA - Problem Set 2B

import java.util.Scanner;

public class Driver{
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        StringTools sTools = new StringTools();
        
        System.out.println("lastLetter test:");
        System.out.println("Enter a word with at least one character: ");
        String answer1 = input.nextLine();

        System.out.println("The last letter is " + sTools.lastLetter(answer1));
        System.out.println("------------");

        System.out.println("formatPhoneNumber test:");
        System.out.println("Enter a 10-digit phone number: ");
        String answer2 = input.nextLine();

        System.out.println("The formatted version of this phone number is: "+sTools.formatPhoneNumber(answer2));
        System.out.println("------------");

        System.out.println("middleThree test:");
        System.out.println("Enter a string with an odd number of characters: ");
        String answer3 = input.nextLine();

        System.out.println("the middle three letters of "+answer3+" are: "+ sTools.middleThree(answer3));
        System.out.println("------------");

        System.out.println("swapLastTwo test:");
        System.out.println("Enter a string: ");
        String answer4 = input.nextLine();

        System.out.println("your new word is " +sTools.swapLastTwo(answer4));
        System.out.println("------------");
        
        System.out.println("matching first and last letters (frontAgain) test:");
        System.out.print("Enter a word: ");
        String answer5 = input.nextLine();
        System.out.print("Enter the number of letters you want to check: ");
        int answer6 =input.nextInt();

        System.out.println("The first "+answer6+" and last "+answer6+ " letter(s) of "+answer5+ " match:" +sTools.frontAgain(answer5,answer6));
        System.out.println("------------");
    }
}
