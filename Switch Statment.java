/*
Question:
Write a Java program that takes a number (1–7) as input and prints the corresponding day of the week.
*/

public class SwitchDayExample {
    public static void main(String[] args) {
        int day = 3; // Example input

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
                System.out.println("Invalid day number!");
        }
    }
}

/*
Expected Output (for day = 3):
Wednesday
*/






/*
Question:
Write a Java program to make a simple calculator using switch statement.
The program should add, subtract, multiply, or divide two numbers based on the operator.
*/

public class SwitchCalculator {
    public static void main(String[] args) {
        int num1 = 20, num2 = 5;
        char operator = '/'; // Example operator

        switch (operator) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0)
                    System.out.println("Result: " + (num1 / num2));
                else
                    System.out.println("Error: Division by zero");
                break;
            default:
                System.out.println("Invalid operator!");
        }
    }
}

/*
Expected Output (for operator = '/'):
Result: 4
*/






I AM TRYING TO UNDERSTAND THIS FULLY!