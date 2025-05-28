import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

// 10773번
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> stack = new ArrayDeque<>();
        int result = 0; // 최종 스택에 남아있는 수의 합 저장 변수

        int k = Integer.parseInt(br.readLine());
        for (int i = 0; i < k; i++) {
            int n = Integer.parseInt(br.readLine());

            if(n == 0) { // 0을 입력하면 pop 수행
                stack.pop();
            } else { // 아니라면, push 연산 수행
                stack.push(n);
            }
        }

        while(!stack.isEmpty()) { // 스택이 비어있지 않을 때까지, pop하여 결과값 더하기
            result += stack.pop(); 
        }

        System.out.println(result);
    }
}
