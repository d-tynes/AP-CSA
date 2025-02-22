/* Dahlia Tynes
 * 7 January 2025
 * APCSA  */

public class Fraction{
    private int numerator;
    private int denominator;
    
    public Fraction(){
        numerator =1;
        denominator =2;
    }
    
    public Fraction(int n, int d){
        numerator=n;
        if(d==0){
            System.out.println("ERROR: denominator cannot be zero");
            d=1;
        }else denominator=d;
        
    }
    
    public Fraction(String str){
        String s=str;
      String[] temp= s.split("/");
      numerator = Integer.parseInt(temp[0]);
      denominator = Integer.parseInt(temp[1]);
      
      if(denominator==0) denominator=1;
      
    }
    
    public Fraction(Fraction f){
        numerator=f.numerator;
        denominator=f.denominator;
    }
    
    public int getNum(){
        return numerator;
    }
    
    public int getDenom(){
        return denominator;
    }
    
    public double toDouble(){
        return (double) numerator/denominator;
    }
    
    public String toString(){
        return (numerator+"/"+denominator);
    }
    
    public void reduce(){
        int factor = GCF(Math.abs(numerator), (Math.abs(denominator)));
        numerator/= factor;
        denominator /=factor;
    }
    
    public void setNum(int replacement){
        numerator=replacement;
    }
    
    public void setDenom(int replacement){
        denominator=replacement;
    }
    
    
    private int GCF(int a, int b){
         
        if(a==b) return a;
        if(a>b) return GCF(a-b,a);
        else return GCF(a,b-a);
        
    }
    
    public static Fraction multiply(Fraction a, Fraction b){
        int newNum=a.numerator*b.numerator;
        int newDenom=a.denominator*b.denominator;
        
        Fraction newFraction = new Fraction(newNum,newDenom);
        return newFraction;
    }
    
    
    
    
    
    
}