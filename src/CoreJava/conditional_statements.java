package CoreJava;

public class conditional_statements {
    public static void main(String[] args) {
        //simple if statement
        int age = 18;
        if (age >= 18) {
            System.out.println("You are eligible to vote!");
        }

        //if-else statement
        int marks = 85;
        if (marks >= 90) {
            System.out.println("Congratulations! You passed the exam.");
        } else {
            System.out.println("Sorry, you failed the exam.");
        }

        //nested if-else statement
        int number = 10;
        if (number % 2 == 0){
            System.out.println("Divisible by 2.");
            if(number % 3 == 0){
                System.out.println("Also divisible by 3.");
            }
        } else {
            System.out.println("The number is odd");
        }

        //ladder if-else-if statement
        int grade = 85;
        if (grade >= 90) {
            System.out.println("Grade: A");
        } else if (grade >= 80) {
            System.out.println("Grade: B");
        } else if (grade >= 70) {
            System.out.println("Grade: C");
        } else if (grade >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        //switch statement
        int day = 6;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number");
        }
    }
}
