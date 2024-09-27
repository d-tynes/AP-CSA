/* dahlia tynes
 * 26/09/2024
 * APCSA - Problem Set 2C
 */

class Formulas{
    public static OrderedPair findQuadraticRoots(double a, double b, double c){
        double x1 = -b - Math.sqrt(Math.pow(b,2)+(-4*a*c));
        x1=x1/(2*a);

        double x2 = -b + Math.sqrt(Math.pow(b,2)+(-4*a*c));
        x2=x2/(2*a);

        return new OrderedPair(x1,x2);
    }

    public double findSlope (OrderedPair A, OrderedPair B){
        double deltaY = (B.y-A.y);
        double deltaX= (B.x-A.x);
        return deltaY/deltaX;
    }

    public OrderedPair findMidpoint(OrderedPair A, OrderedPair B){
        double x = (A.x+B.x)/2;
        double y = (A.y+B.y)/2;
        return new OrderedPair(x,y);
    }

    public double findArithmeticSeriesSum (double a, double d, int k){
         double sum = (k/2*(a+a*d));
         return sum;
    }

    public double findGeometricSeriesSum (double a, double r, int k) {
        double sum = a*(1-Math.pow(r,k))/ a*(1-r);
        return sum;
    }
    
 public int rollDie (int sides){
    int max=sides;
    return (int) (Math.random()*sides+1);
 }
}












