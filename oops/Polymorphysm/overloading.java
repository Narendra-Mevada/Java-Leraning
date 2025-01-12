
//read Overloading.md file to understand.

package Polymorphysm;
class person {
    String Name;
    int Age;

   
    public void printPerson(String name) {
        System.out.println(name);
        }
    public void printPerson(int age){
        System.out.println(age);
    }
    public void printPerson(String name,int age){
        System.out.println(name);
        System.out.println(age);
    }
}

public class overloading {

}
