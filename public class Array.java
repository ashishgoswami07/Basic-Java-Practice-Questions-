public class ArraySample {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 9, 4};

        System.out.println("Array elements:");
        for (int num : numbers) {
            System.out.println(num);
        }

        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];

        for (int num : numbers) {
            sum += num;
            if (num > max) max = num;
            if (num < min) min = num;
        }

        double average = (double) sum / numbers.length;

        System.out.println("Sum: " + sum);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + average);
    }
}




Array elements:
3
7
2
9
4
Sum: 25
Max: 9
Min: 2
Average: 5.0
