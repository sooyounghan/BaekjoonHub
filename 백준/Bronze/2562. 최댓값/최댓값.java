import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[9];

        for(int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        maxAndIndex(arr);
    }

    // 최댓값과 그 위치를 찾는 메서드
    private static void maxAndIndex(int[] arr) {
        int max = arr[0]; // 처음 최댓값은 첫 번째 요소
        int k = 0; // 최댓값이 존재하는 위치

        for(int i = 0; i < 9; i++) {
            if(arr[i] > max) {
                max = arr[i]; // 배열 요소 중 최대값을 찾으면, 그 값을 max 변수 저장
                k = i;
            }
        }

        System.out.println(max);
        System.out.println(k + 1); // 실제 k번째와 배열 인덱스는 -1 차이나므로 이를 처리
    }
}
