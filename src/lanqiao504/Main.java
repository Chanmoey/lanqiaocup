package lanqiao504;

import java.util.Scanner;

/**
 * @author Chanmoey
 * @date 2021年12月09日 8:58
 * @description O(n)
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        String input = scan.next();
        int max = -1;
        int index = 26;
        int[] freq = new int[26];

        for (char c : input.toCharArray()) {
            int cAt = c - 'a';
            freq[cAt]++;
            if (freq[cAt] > max) {
                max = freq[cAt];
                index = cAt;
            } else if (freq[cAt] == max) {
                index = Math.min(index, cAt);
            }
        }

        System.out.println((char) ('a' + index));
        System.out.println(max);
        scan.close();
    }
}
