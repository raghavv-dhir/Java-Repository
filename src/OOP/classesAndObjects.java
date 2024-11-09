package OOP;

public class classesAndObjects {
    public static void main(String[] args) {
        RCB p1 = new RCB("Virat Kohli",36,"Indian","Batsman");
        RCB p2 = new RCB("Glenn Maxwell", 32, "Australian", "All rounder");
        RCB p3 = new RCB("Alzari Joseph",30, "West Indies", "Bowler");
        p1.displayDetails();
        p2.displayDetails();
        p3.displayDetails();
    }
    public static class RCB{
        String name;
        int age;
        String nationality;
        String type;
        public RCB(String name, int age, String nationality, String type){
            this.name = name;
            this.age = age;
            this.nationality = nationality;
            this.type = type;
        }
        public void displayDetails(){
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Nationality: " + nationality);
            System.out.println("Type: " + type);
        }
    }
}
