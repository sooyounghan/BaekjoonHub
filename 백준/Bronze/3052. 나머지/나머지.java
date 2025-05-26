import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];
        boolean[] isDivisor = new boolean[42]; // 42로 나눈 나머지에 대해 표시할 배열
        int count = 0; // 총 서로 다른 값이 몇개 있는지 저장할 변수

        for(int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }

        for(int i = 0; i < arr.length; i++) {
            isDivisor[arr[i] % 42] = true; // 42로 나눈 나머지의 값들을 isDivisor 인덱스로 하여 true로 설정
        }

        for(int i = 0; i < isDivisor.length; i++) {
            if(isDivisor[i]) { // isDivsior[i]의 true이면, 나머지가 있었다는 뜻이고, 총 42개 중 몇 개인지 확인 가능
                count++;
            }
        }

        System.out.println(count);
    }
}