package lanqiao1536;

import java.util.Scanner;

/**
 * @author Chanmoey
 * @date 2021年12月12日 18:53
 * @description
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...

        int n = scan.nextInt();
        int[][] triangle = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = scan.nextInt();
            }
        }
        scan.close();

        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j ++) {
                triangle[i][j] += Math.max(triangle[i + 1][j], triangle[i + 1][j + 1]);
            }
        }

        System.out.println(triangle[0][0]);
    }
}
