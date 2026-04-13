package TestPad;

import java.util.Scanner;
// Other imports go here// Do NOT change the class name

class Rectangle
{
    int x;
    int y;
    int width;
    int height;
    Rectangle(int a,int b, int c, int d){
        this.x=a;
        this.y=b;
        this.width=c;
        this.height=d;
    }
    public int getHeight(){
        return height;
    }
    public int getWidth(){
        return width;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public String toString(){
        return "Rectangle[x="+x+",y="+y+",width="+width+",height="+height+"]";
    }
}
