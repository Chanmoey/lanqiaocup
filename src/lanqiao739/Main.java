package lanqiao739;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author Chanmoey
 * @date 2021年12月12日 16:50
 * @description
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        BigDecimal res = new BigDecimal("0");
        BigDecimal two = new BigDecimal("2");
        for (int i = 0; i < 64; i++) {
            res = res.add(two.pow(i));
        }
        System.out.println(res);
        scan.close();
    }
}
