//Please read inheritance.md file to understand this code;
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
class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }  
}
//add class for multi level inheritance and remove for Hierarchial Inheritance.
class EqualiteralTriangle extends Triangle{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }  
}
public class inheritance {
    public static void main(String[] args) {
        
    }
}
