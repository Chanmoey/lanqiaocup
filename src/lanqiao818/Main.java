package lanqiao818;

import java.util.Scanner;

/**
 * @author Chanmoey
 * @date 2021年12月14日 17:53
 * @description
 */

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        scan.close();
        int i = 5;
        while (true) {
            int res = 2019 * i;
            if (allBitIsOdd(res)) {
                System.out.println(res);
                return;
            }
            i ++;
        }
    }

    private static boolean allBitIsOdd(int number) {
        while (number != 0) {
            if (((number % 10) & 1) != 1) {
                return false;
            }
            number /= 10;
        }

        return true;
    }
}
