package lanqiao505;

import com.sun.javaws.IconUtil;

import java.util.Scanner;

/**
 * @author Chanmoey
 * @date 2021年12月12日 10:51
 * @description 超过时间限制
 */
public class Main {

    private static int LIMIT_LEVEL;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        LIMIT_LEVEL = scan.nextInt();
        int[][] triangle = new int[LIMIT_LEVEL][LIMIT_LEVEL];
        for (int i = 0; i < LIMIT_LEVEL; i++) {
            for (int j = 0; j < i + 1; j++) {
                triangle[i][j] = scan.nextInt();
            }
        }
        scan.close();
        int max = maxSum(triangle, 0, 0, 0, 0);
        System.out.println(max);
    }

    private static int maxSum(int[][] triangle, int row, int col, int left, int right) {

        if (left > LIMIT_LEVEL / 2 + 1 || right > LIMIT_LEVEL / 2 + 1) {
            return Integer.MIN_VALUE;
        }

        if (row == LIMIT_LEVEL - 1) {

            // 向左走的总次数和向右走的总次数不能超过1.
            if (Math.abs(left - right) > 1) {
                return Integer.MIN_VALUE;
            }

            return triangle[row][col];
        }

        return Math.max(maxSum(triangle, row + 1, col, left + 1, right),
                maxSum(triangle, row + 1, col + 1, left, right + 1)) + triangle[row][col];
    }
}
