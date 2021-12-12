package lanqiao497;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Chanmoey
 * @date 2021年12月12日 17:23
 * @description
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...

        int people = scan.nextInt();
        int max = -1;
        int min = 101;
        double ave = 0.0;

        for (int i = 0; i < people; i ++) {
            int nextScope = scan.nextInt();
            ave += nextScope;
            max = Math.max(max, nextScope);
            min = Math.min(min, nextScope);
        }
        scan.close();

        System.out.println(max);
        System.out.println(min);
        System.out.println(new DecimalFormat("#.00").format(ave / people));
    }
}
