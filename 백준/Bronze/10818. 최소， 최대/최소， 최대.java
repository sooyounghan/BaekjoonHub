import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = null;

        if(n >= 1 && n <= 1_000_000) {
            arr = input_array(n, scanner);
        }

        minAndMax(arr);
    }

    private static int[] input_array(int n, Scanner scanner) {
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(scanner.next());
        }

        return arr;
    }

    private static void minAndMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }

            if(max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println(min + " " + max);
    }
}
