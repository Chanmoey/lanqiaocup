package lanqiao819;

import java.util.Scanner;

/**
 * @author Chanmoey
 * @date 2021年12月11日 15:48
 * @description 30行50列的矩阵
 */
public class Main {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        //在此输入您的代码...
//
//        char[][] matrix = new char[30][50];
//        for (int i = 0; i < 30; i++) {
//            matrix[i] = scan.next().toCharArray();
//        }
//        scan.close();
//        int res = 0;
//        res += getRow(matrix);
//        res += getCol(matrix);
//        res += getDiagonal(matrix);

        // 我是真的服了这个OJ平台了，你算出来还不行，你得手动输出。
        System.out.println("52800");
    }

    private static int getRow(char[][] matrix) {

        int res = 0;

        for (char[] chars : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                for (int k = j + 1; k < matrix[0].length; k++) {
                    if (chars[k] - chars[j] > 0) {
                        res++;
                    }
                }
            }
        }

        return res;
    }

    private static int getCol(char[][] matrix) {

        int res = 0;

        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                for (int k = i + 1; k < matrix.length; k++) {
                    if (matrix[k][j] - matrix[i][j] > 0) {
                        res++;
                    }
                }
            }
        }

        return res;
    }

    private static int getDiagonal(char[][] matrix) {

        int res = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int m = i + 1, n = j + 1;
                while (m < matrix.length && n < matrix[0].length) {
                    if (matrix[m++][n++] - matrix[i][j] > 0) {
                        res++;
                    }
                }
                m = i - 1;
                n = j + 1;
                while (m >= 0 && n < matrix[0].length) {
                    if (matrix[m--][n++] - matrix[i][j] > 0) {
                        res++;
                    }
                }

                m = i + 1;
                n = j - 1;
                while (m < matrix.length && n >= 0) {
                    if (matrix[m++][n--] - matrix[i][j] > 0) {
                        res++;
                    }
                }
            }
        }

        return res;
    }
}
