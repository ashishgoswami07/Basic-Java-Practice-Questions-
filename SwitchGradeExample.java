/*
Problem Statement:
We need a program that can give grades to students based on their marks. 
The grading rules are simple:
- 90 to 100 marks → Grade A
- 75 to 89 marks → Grade B
- 50 to 74 marks → Grade C
- 35 to 49 marks → Grade D
- Below 35 marks → Grade F

We will use a switch statement to make this logic clear and structured.
*/

public class SwitchGradeExample {
    public static void main(String[] args) {
        int marks = 82; // Let's assume the student scored 82 marks
        char grade;

        // Dividing marks by 10 to simplify range checking
        switch (marks / 10) {
            case 10: // for marks = 100
            case 9:  // for marks in 90s
                grade = 'A';
                break;
            case 8:  // for marks in 80s
            case 7:  // for marks in 70s
                grade = 'B';
                break;
            case 6:  // for marks in 60s
            case 5:  // for marks in 50s
                grade = 'C';
                break;
            case 4:  // for marks in 40s
                grade = 'D';
                break;
            default: // anything less than 40
                grade = 'F';
        }

        System.out.println("Marks: " + marks + " → Grade: " + grade);
    }
}

/*
Sample Output:
If marks = 82
Marks: 82 → Grade: B
*/
