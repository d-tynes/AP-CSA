/* dahlia tynes
 * 26/09/2024
 * APCSA - Problem Set 2C
 */

import java.util.Scanner;

class Driver{
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        OrderedPair a = new OrderedPair();
        OrderedPair b = new OrderedPair(2,2);

        Formulas answer = new Formulas();

        System.out.println("QUADRATIC FORMULA: Find the roots of ax^2 + bx + c.\nEnter a, b and c:");
        System.out.print("a:");
        double ax = input.nextDouble();
        System.out.print("b:");
        double bx= input.nextDouble();
        System.out.print("c:");
        double cx=input.nextDouble();
        System.out.println("The solutions for "+ax+"x^2 + "+bx+"x + "+cx+ 
            " are"+ answer.findQuadraticRoots(ax,bx,cx));

        System.out.println("SLOPE FORMULA: Find the slope between points (x1,y1) and (x2,y2)");
        System.out.print("x1:");
        double x1 = input.nextDouble();
        System.out.print("y1:");
        double y1 = input.nextDouble();
        System.out.print("x2:");
        double x2 = input.nextDouble();
        System.out.print("y2:");
        double y2 = input.nextDouble();

        OrderedPair pointOne = new OrderedPair(x1,y1);
        OrderedPair pointTwo = new OrderedPair(x2,y2);

        System.out.println("A line between "+new OrderedPair(x1,y1)+" and "+new OrderedPair(x2,y2)+" has a slope of "+
        answer.findSlope(new OrderedPair(x1,y1),new OrderedPair(x2,y2))+"\n");

        System.out.println("MIDPOINT FORMULA: Find the midpoint between (x1,y1) and (x2,y2)");
        System.out.print("x1:");
        double mpx1 = input.nextDouble();
        System.out.print("y1:");
        double mpy1 = input.nextDouble();
        System.out.print("x2:");
        double mpx2 = input.nextDouble();
        System.out.print("y2:");
        double mpy2 = input.nextDouble();
        
        System.out.println("The midpoint between "+new OrderedPair(mpx1,mpy1)+" and "+new OrderedPair(mpx2,mpy2)+" is"
        +answer.findMidpoint(new OrderedPair(mpx1,mpy1),new OrderedPair(mpx2,mpy2)));
        
        System.out.println("SUM OF AN ARITHMETIC SERIES");
        System.out.print("number of terms:");
        int  k= input.nextInt();
        System.out.print("starts with:");
        double d = input.nextDouble();
        System.out.print("increases by:");
        double r = input.nextDouble();

        System.out.println("The sum of the first "+k+ " terms of an arithmetic series that starts with "+d+" and increases by "+r+" is "+
        answer.findArithmeticSeriesSum(d,r,k));
        
        System.out.println(answer.findGeometricSeriesSum(2,2,0));
        System.out.println(answer.rollDie(20));
    }
}











