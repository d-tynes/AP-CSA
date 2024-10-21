public class DrawGrid {

    void drawGrid(){
        StdDraw.setScale(0, 500);
        for(int x=0;x<500;x=x+20){
            StdDraw.line(x,0,x,500);
            StdDraw.line(0,x,500,x);
        }
    }

    void drawCurve(){
        StdDraw.setScale(0, 500);
        for(int x=0;x<501;x+=20){
            StdDraw.line(0,x,500-x,0);
            StdDraw.line(500,500-x,x,500);
        }
    }

    void drawCircles(){
        StdDraw.setScale(0, 500);
        for(int x=500;x>0;x-=40){
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledCircle(250, 250, x);
            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.filledCircle(250,250,x-20);

        }
    }
    
    void drawTriangle(){
        StdDraw.setScale(0, 500);
        OrderedPair v1,v2,v3;
        StdDraw.point(0,100);
        StdDraw.point(200,100);
        StdDraw.point(100,200);
        
        
        
    }
}
