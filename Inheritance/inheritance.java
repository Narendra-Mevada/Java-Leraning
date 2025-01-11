package Inheritance;

class Shape{
    String color;
    public void area(){
        System.out.println("Calculate Area:");
    }

}
class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }  
}
//add class for multi level inheritance
class EqualiteralTriangle extends Triangle{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }  
}
public class inheritance {
    
}
