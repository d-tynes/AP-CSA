class OrderedPair{
    double x,y;
    OrderedPair(){
        x=0;
        y=0;
    }

     OrderedPair(double a, double b){
        x=a;
        y=b;
    }

    public String toString(){
        return"("+x+","+y+")";
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }
}