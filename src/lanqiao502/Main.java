package lanqiao502;

import java.util.Scanner;

/**
 * @author Chanmoey
 * @date 2021年12月09日 15:03
 * @description
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...

        int gross = Integer.parseInt(scan.next());
        double passNum = 0.0;
        double excellentNum = 0.0;
        int score;

        while (scan.hasNext()) {
            score = Integer.parseInt(scan.next());
            if (score >= 60) {
                passNum++;
                if (score >= 85) {
                    excellentNum++;
                }
            }
        }
        scan.close();

        long pass = Math.round(passNum * 100 / gross);
        long excellent = Math.round(excellentNum * 100 / gross);

        System.out.println(pass + "%");
        System.out.println(excellent + "%");
    }
}
