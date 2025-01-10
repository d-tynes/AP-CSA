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
      String[] temp= s.split(",");
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
    
    public static Fraction divide(Fraction a, Fraction b){
        int newNum=a.numerator*b.denominator;
        int newDenom=a.denominator*b.numerator;
        
        Fraction newFraction = new Fraction(newNum,newDenom);
        return newFraction;
    }
    
    public static Fraction add(Fraction a, Fraction b){
        int newDenom=a.denominator*b.denominator;
        int newNumerator=(a.numerator*b.denominator + b.numerator*a.denominator);
    
        Fraction newFraction=new Fraction(newNumerator,newDenom);
        return newFraction;
        
    }
    
    public static Fraction subtract(Fraction a, Fraction b){
        int newDenom=a.denominator*b.denominator;
        int newNumerator=(a.numerator*b.denominator - b.numerator*a.denominator);
    
        Fraction newFraction=new Fraction(newNumerator,newDenom);
        return newFraction;
        
    }
    
    
    public static Fraction findPI(){
        
        //finding a fraction closer to PI than MILU
        Fraction MILU = new Fraction(355, 113 );
        final double EPSILON = Math.abs(Math.PI - MILU.toDouble());
        
        
        //starting num + denom of "PI"
        int tempNum = 3;
        int tempDenom=1;
        
        
        //representing our approximation of PI
        Fraction approximationPI=new Fraction(tempNum,tempDenom);
        
        
        double approximatePI=approximationPI.toDouble();
        //looping until difference between MILU and Math.PI is acceptable
        while(Math.abs( Math.PI - approximatePI ) >= EPSILON){
        if( approximatePI < Math.PI) approximationPI.numerator+=1;
         else approximationPI.denominator+=1;
          approximatePI=approximationPI.toDouble();
        System.out.println(approximationPI.toString());
        }
        return approximationPI;
    }
    
    }
    
    
    
    
    
    
