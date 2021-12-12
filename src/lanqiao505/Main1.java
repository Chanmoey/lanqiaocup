package lanqiao505;

import java.util.Scanner;

/**
 * @author Chanmoey
 * @date 2021年12月12日 12:15
 * @description 使用动态规划
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int n = scan.nextInt();
        int[][] triangle = new int[n][n];
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                triangle[i][j] = scan.nextInt();
            }
        }
        scan.close();

        dp[0][0] = triangle[0][0];
        for (int i = 1; i < n; i++) {
            dp[i][0] = dp[i - 1][0] + triangle[i][0];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i][j] = triangle[i][j] + Math.max(dp[i - 1][j], dp[i - 1][j - 1]);
            }
        }

        if (n % 2 != 0) {
            System.out.println(dp[n - 1][n / 2]);
        } else {
            System.out.println(Math.max(dp[n - 1][n / 2], dp[n - 1][n / 2 - 1]));
        }
    }
}