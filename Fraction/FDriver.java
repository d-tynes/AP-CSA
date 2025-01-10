

import java.util.Scanner;

class FDriver{
    
    public static void main (String[]args){
        
       Fraction half = new Fraction(1,2);
       Fraction third = new Fraction(1,3);
       
       /*System.out.println(half.multiply(half,third));
       System.out.println(half.divide(half,third));
       System.out.println(half.add(half,third));
       System.out.println(half.subtract(half,third));*/
       
       System.out.println(half.findPI());
    }
}