import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrixA = createMatrix(n, m, scanner);
        int[][] matrixB = createMatrix(n, m, scanner);

        matrixAdd(n, m, matrixA, matrixB);
    }

    // 행렬 생성 메서드
    private static int[][] createMatrix(int n, int m, Scanner scanner) {
        int[][] matrix = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

    // 행렬 덧셈 메서드
    private static void matrixAdd(int n, int m, int[][] matrixA, int[][] matrixB) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(matrixA[i][j] + matrixB[i][j] + " ");
            }
            System.out.println();
        }
    }
}