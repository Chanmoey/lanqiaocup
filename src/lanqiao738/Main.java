package lanqiao738;

import java.util.Scanner;

/**
 * @author Chanmoey
 * @date 2021年12月13日 17:33
 * @description
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        scan.close();

        // 最小公倍数
        int lcm = lcm(lcm(2012, 3), 12);

        for (int i = 1900; i < 2012; i++) {
            int date = (i * 100 + 6) * 100;
            for (int j = 1; j <= 30; j ++) {
                if ((date + j) % lcm == 0) {
                    System.out.println(date + j);
                    return;
                }
            }
        }
    }

    /**
     * 求两个数得最小公倍数
     * @param a 数
     * @param b 数
     * @return 最小公倍数
     */
    private static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }

    /**
     * 求两个数得最大公因子
     * @param a 数
     * @param b 数
     * @return 最大公因子
     */
    private static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }

        return gcd(b, a % b);
    }
}
