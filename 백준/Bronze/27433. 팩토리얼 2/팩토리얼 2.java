import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        if(n >= 0 && n <= 20) { // 정수 N(0 ≤ N ≤ 20)
            System.out.println(factorial(n));
        }
    }

    // Factorial 함수 구현 : 정수 N은 0부터 20까지이므로 20!은 int의 범위를 벗어남
    private static long factorial(long n) {
        if(n == 0 || n == 1) return 1; // 기저 조건
        return n * factorial(n - 1); // 재귀 호출
    }
}