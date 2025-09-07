public class InsertionSortShort {
    public static void main(String[] args) {
        int[] arr = {4, 23, 6, 78, 1, 54, 231, 9, 12};

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i], j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        for (int n : arr) System.out.print(n + " ");
    }
}



OUTPUT
1 4 6 9 12 23 54 78 231
