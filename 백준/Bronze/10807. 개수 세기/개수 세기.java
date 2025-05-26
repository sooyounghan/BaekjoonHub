import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = null;

        arr = input_array(n, arr, sc);

        int v = sc.nextInt();
        int result = count_v(v, arr);
        System.out.println(result);
    }

    // 배열 요소 생성 메서드
    private static int[] input_array(int n, int[] arr, Scanner sc) {
        if(n >= 1 && n <= 100) { // n의 조건
            arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
        }
        return arr;
    }

    // 배열 요소 중 v와 같은 요소의 개수 세기 메서드
    private static int count_v(int v, int[] arr) {
        int count = 0;
        if(v >= -100 && v <= 100) { // v 조건
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] == v) { // 배열 요소 중 v와 값이 일치하면 count 증가
                    count++;
                }
            }
        }
        return count;
    }
}
