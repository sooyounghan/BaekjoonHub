import java.util.Scanner;

public class Main {
    public static int count = 0; // 전역 변수로 count 횟수 선언

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for(int i = 1; i <= n; i++) {
            count = 0; // 입력받을 때마다 count 값 초기화
            String palindrome = scanner.nextLine();
            System.out.println(isPalindrome(palindrome) + " " + count);
        }
    }

    private static int isPalindrome(String palindrome) {
        return recursive(palindrome, 0, palindrome.length() - 1); // Palindrome : 가장 앞인 첫 문자와 가장 뒤인 마지막 문자부터 시작
    }

    private static int recursive(String palindrome, int left, int right) {
        count++; // 호출될 때마다 count 값 증가
        if(left >= right) return 1; // 문자열의 가운데 지점 또는 왼쪽 인덱스의 값이 오른쪽 인덱스보다 커지는 경우 : 비교한 문자열들이 모두 같은 문자열이므로 1 반환
        else if(palindrome.charAt(left) != palindrome.charAt(right)) return 0; // 문자를 비교했는데, 같지 않다면 더 이상 비교할 필요가 없으므로 0 반환
        else return recursive(palindrome, left + 1, right - 1); // 문자를 비교했는데, 같다면 다음 문자열 비교를 위해 왼쪽 글자는 한 칸 이동, 오른쪽 글자도 한 칸 이동해 다음 문자 비교 (재귀)
    }
}