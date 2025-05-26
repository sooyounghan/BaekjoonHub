import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 9;
        int m = 9;
        int[][] arr = new int[n][m];

        int max = 0; // 최댓값을 저장할 변수
        int[] index = new int[2]; // 최댓값을 가진 행과 열을 저장할 배열

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < n; i++ ) {
            for(int j = 0; j < m; j++) {
                if(arr[i][j] > max) { // 최댓값 찾기
                    max = arr[i][j];
                    index[0] = i;
                    index[1] = j;
                }
            }
        }

        System.out.println(max);
        System.out.println((index[0] + 1) + " " + (index[1] + 1)); // 배열은 인덱스가 0부터 시작하므로 + 1 (행, 열)
    }
}