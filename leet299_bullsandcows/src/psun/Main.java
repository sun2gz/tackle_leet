package psun;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/bulls-and-cows/
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getHint("1807", "7810"));
        System.out.println(getHint("1123", "0111"));
    }

    static String getHint(String secret, String guess) {

        int bulls = 0;
        int cows = 0;

        int[] secret_nonmatch = new int[10];
        int[] guess_nonmatch = new int[10];


        for (int i = 0; i<secret.length(); i++)
        {
            if (secret.charAt(i) == guess.charAt(i))
            {
                bulls++;
            }
            else
            {
                secret_nonmatch[secret.charAt(i)-'0']++;
                guess_nonmatch[guess.charAt(i)-'0']++;
            }
        }

        for (int j = 0; j < 10; j++)
        {
            int a = secret_nonmatch[j];
            int b = guess_nonmatch[j];

            cows += a>b?b:a;
        }

        return bulls+"A"+cows+"B";

    }
}
