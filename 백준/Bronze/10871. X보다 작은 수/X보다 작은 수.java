import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.next());
        int x = Integer.parseInt(scanner.next());

        int[] arr = null;

        if(n >= 1 && n <= 10_000) {
             arr = input_array(n, scanner);
        }

        if(x >= 1 && x <= 10_000) {
            smallerX(n, arr, x);
        }
    }

    private static int[] input_array(int n, Scanner scanner) {
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(scanner.next());
        }

        return arr;
    }

    private static void smallerX(int n, int[] arr, int x) {
        for(int i = 0; i < n; i++) {
            if(arr[i] < x) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
