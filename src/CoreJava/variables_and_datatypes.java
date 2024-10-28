package CoreJava;

public class variables_and_datatypes{
    public static void main(String[] args) {

        //variables are used to store and manipulate data in a program, just like containers to hold information
        //datatypes are the types of data that variables can hold, such as integers, floating-point numbers, characters, and booleans
        //Primitive Datatypes: byte, short, int, long, float, double, char, boolean
        // Declare and initialize a variable of type int
        int myInt = 10;
        myInt = myInt + 5;
        // Declare and initialize a variable of type double
        double myDouble = 3.14;

        // Declare and initialize a variable of type char
        char myChar = 'A';

        // Declare and initialize a variable of type boolean
        boolean myBoolean = true;

        // Call the printMessage method
        printMessage("We are learning about variables and data types in Java! ^^");

        // Print the values of the variables
        System.out.println("Primitive Datatypes: ^^");
        System.out.println("myInt: " + myInt);
        System.out.println("myDouble: " + myDouble);
        System.out.println("myChar: " + myChar);
        System.out.println("myBoolean: " + myBoolean);

        //User-defined datatype: CoreJava.Student
        System.out.println("User-defined datatype: CoreJava.Student");
        Student student1 = new Student();
        student1.rollNo = 1;
        student1.name = "John Doe";
        student1.age = 20;
        student1.city = "New York";
        System.out.println("CoreJava.Student 1: Roll No - " + student1.rollNo + ", Name - " + student1.name + ", Age - " + student1.age + ", City - " + student1.city);

        Student student2 = new Student();
        student2.rollNo = 2;
        student2.name = "Jane Smith";
        student2.age = 22;
        student2.city = "Los Angeles";
        System.out.println("CoreJava.Student 2: Roll No - " + student2.rollNo + ", Name - " + student2.name + ", Age - " + student2.age + ", City - " + student2.city);
    }
    public static void printMessage(String message) {
        System.out.println(message);
    }
}
class Student {
    int rollNo;
    String name;
    int age;
    String city;
}