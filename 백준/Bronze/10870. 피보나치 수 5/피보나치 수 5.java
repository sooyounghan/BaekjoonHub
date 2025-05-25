import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n >= 0 && n <= 20) { // n은 20보다 작거나 같은 자연수 또는 0
            System.out.println(fibonacci(n));
        }
    }

    // 피보나치 수열 구현
    private static int fibonacci(int n) {
        if(n == 0) return 0; // n은 0으로 시작 조건 (0번째 피보나치 수는 0)
        else if(n == 1) return 1; // n은 1으로 시작 조건 (1번째 피보나치 수는 1)
        else return fibonacci(n - 2) + fibonacci(n -1); // 재귀로 처리
    }
}