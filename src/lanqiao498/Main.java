package lanqiao498;

import sun.java2d.pipe.SpanShapeRenderer;

import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * @author Chanmoey
 * @date 2021年12月09日 20:11
 * @description
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        boolean flag = false;
        int start = Integer.parseInt(scan.next());
        for (int i = start + 1; i <= 99999999; i++) {

            if (isLegalDate(i)) {

                if (!flag && isPalindrome(String.valueOf(i))) {
                    System.out.println(i);
                    flag = true;
                }

                if (flag && isABABBABA(String.valueOf(i))) {
                    System.out.println(i);
                    break;
                }

            }
        }
        scan.close();

    }

    private static boolean isPalindrome(String date) {
        StringBuilder year = new StringBuilder(date.substring(0, 4));
        return year.reverse().toString().equals(date.substring(4));
    }

    private static boolean isABABBABA(String date) {

        if (isPalindrome(date)) {
            return date.charAt(0) == date.charAt(2) && date.charAt(1) == date.charAt(3);
        }

        return false;
    }

    /**
     * 判断是不是有效日期
     *
     * @param date 日期
     * @return 校验结果
     */
    private static boolean isLegalDate(int date) {
        int month = (date % 10000) / 100;
        int day = (date % 10000) % 100;

        // the month which hava 31 days.
        if (month == 1 || month == 3 || month == 5 ||
                month == 7 || month == 8 || month == 10 || month == 12) {
            return day <= 31;
        }

        // the month which have 30 days.
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return day <= 30;
        }

        // special handing in February.
        if (month == 2) {

            date /= 1000;
            if (date % 4 == 0 || (date % 100) == 0) {
                return day <= 29;
            } else {
                return day <= 28;
            }
        }

        return false;
    }
}
