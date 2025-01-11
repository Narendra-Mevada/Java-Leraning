
//created a class{
class person {
    String Name;
    String Branch;
    int Age;

    // made a function
    public void write() {
        System.out.println("hello,");
    }

    // made a function to print all details;
    public void printPerson() {
        System.out.println("Name:" + this.Name);
        System.out.println("Age: " + this.Age);
        System.out.println("Branch: " + this.Branch);
    }
}
// }

// Main class 
public class obj {
    // main function
    public static void main(String[] args) {

        // made a object of that 'person' class
        person person1 = new person();
        person1.Name = "Narendra";
        person1.Age = 19;
        person1.Branch = "Computer Science";

        // another object;
        person person2 = new person();
        person2.Name = "Mevada";
        person2.Age = 18;
        person2.Branch = "Engineering";

        // call the function for first object;
        person1.write();
        person1.printPerson();

        System.out.println();
        // call the function for second object;
        person2.write();
        person2.printPerson();
    }
}