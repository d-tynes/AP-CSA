//dahlia tynes
//28/10/2024

//sentimentVal test


import java.util.Scanner;

class Driver{
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter a review to see its value");
        
        System.out.println(Review.totalSentiment("review2.txt"));
        System.out.println(Review.starRating("review2.txt") + " stars");
        
        
       
    }
}