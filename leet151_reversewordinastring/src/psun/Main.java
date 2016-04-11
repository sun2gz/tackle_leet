package psun;

/**
 * https://leetcode.com/problems/reverse-words-in-a-string/
 */
public class Main {

    public static void main(String[] args) {
        String s = "  the sky is    blue   ";

        System.out.println(reverseWords(s));
    }

    static String reverseWords(String s)
    {
        int i = 0;
        String result = "";

        while (i<s.length())
        {
            String word = "";

            while (i<s.length() && s.charAt(i) != ' '){
                word += s.charAt(i);
                i++;
            }

            while (i<s.length() && s.charAt(i) == ' ') {
                i++;
            }

            if (word != "") {
                if (result=="")
                    result = word;
                else
                    result = word + " " + result;
            }


        }

        return result;
    }
}
