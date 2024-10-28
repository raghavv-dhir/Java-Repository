package CoreJava;

public class ObjectOrientedProgramming {
    public static void main(String[] args) {
        Players player1 = new Players("Virat Kohli", 37, "Indian", "India, Royal Challengers Bangalore");
        player1.displayDetails();

        Players player2 = new Players("Rohit Sharma", 39, "Indian", "India, Mumbai Indians");
        player2.displayDetails();

        Players player3 = new Players("Ravichandran Ashwin", 40, "Indian", "India, Rajasthan Royals");
        player3.displayDetails();

        Animal animal1 = new Animal("Lion", 10, "Panthera leo", "Golden", "Large");
        animal1.displayDetails();

        Animal animal2 = new Animal("Tiger", 12, "Panthera tigris", "Orange", "Large");
        animal2.displayDetails();

        Animal animal3 = new Animal("Elephant", 15, "Loxodonta africana", "Grey", "Large");
        animal3.displayDetails();

        Human human1 = new Human("John Doe", 30, "Human", "Dark", "6 feet", "Analyst");
        human1.displayDetails();
    }
}
class Players{
    String name;
    int age;
    String nationality;
    String team;

    //constructor to initialize object properties, automatically called when a new object is created, no return type required
    public Players(String name, int age, String nationality, String team){
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.team = team;
    }
    void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Nationality: " + nationality);
        System.out.println("Team: " + team);
    }
}
class Animal{
    String name;
    int age;
    String breed;
    String color;
    String size;
    //constructor to initialize object properties, automatically called when a new object is created, no return type required
    public Animal(String name, int age, String breed, String color, String size){
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
        this.size = size;
    }

    void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Breed: " + breed);
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
    }
}
class Human extends Animal{ //Inheritance-> Human class is using properties and methods of Animal class, reducing code duplication
    String occupation;
    //constructor to initialize object properties, automatically called when a new object is created, no return type required
    public Human(String name, int age, String breed, String color, String size, String occupation){
        super(name, age, breed, color, size);
        this.occupation = occupation;
    }

    void displayDetails(){
        super.displayDetails(); //super keyword is used to access and call methods of parent class
        System.out.println("Occupation: " + occupation);
    }
}
