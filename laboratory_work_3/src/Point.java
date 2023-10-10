public class Point {
    private int x,y;
    Point (int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    int getX() {return x;}
    int getY(){return y;}
    void setX(){this.x=x;}
    void setY(){this.y=y;}
    double dist(int x,int y){
        int dx=this.x-x;
        int dy=this.y-y;
        return Math.sqrt(dx*dx+dy*dy);
    }
    double dist(Point p){
        return dist(p.getX(),p.getY());
    }
}
