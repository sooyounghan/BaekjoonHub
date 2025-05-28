import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int commandSize = Integer.parseInt(br.readLine());
        for(int i = 0; i < commandSize; i++) { // 명령의 수 만큼 반복
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int command = Integer.parseInt(st.nextToken()); // 명령 입력

            switch(command) { // switch문으로 분기
                case 1 : // 1 : push 연산
                    int value = Integer.parseInt(st.nextToken());
                    stack.push(value);
                    break;

                case 2 : // 2 : pop 연산
                    System.out.println((stack.isEmpty()) ? -1 : stack.pop());
                    break;

                case 3 : // 3. size 연산
                    System.out.println(stack.size());
                    break;

                case 4 : // 4. isEmpty() 연산
                    System.out.println(stack.isEmpty() ? 1 : 0);
                    break;

                case 5 : // 5. peek() 연산
                    System.out.println((stack.isEmpty()) ? -1 : stack.peek());
                    break;
            }
        }
    }
}