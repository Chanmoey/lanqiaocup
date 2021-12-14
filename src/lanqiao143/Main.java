package lanqiao143;

import java.util.Scanner;

/**
 * @author Chanmoey
 * @date 2021年12月14日 18:06
 * @description
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int n = scan.nextInt();
        scan.close();

        int remainder;
        int result = n;
        while (n >= 3) {
            remainder = n % 3;
            n /= 3;
            result += n;
            n += remainder;
        }

        System.out.println(result);
    }
}
