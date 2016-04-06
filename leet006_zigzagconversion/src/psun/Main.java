package psun;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 4));
    }

    static String convert(String s, int numRows) {
        List<String> rows = new ArrayList<String>();

        for (int x=0; x<numRows; x++)
        {
            rows.add("");
        }


        int i = 0;      // string index
        int j = 0;      // column number
        while (i<s.length()) {

            if (j%(numRows-1) == 0){
                for (int z = 0; z<numRows && i<s.length(); z++) {
                    rows.set(z, rows.get(z)+s.toCharArray()[i]);
                    i++;
                }

                j++;
                continue;
            }

            else {
                rows.set(j%(numRows-1),rows.get(j%(numRows-1))+s.toCharArray()[i]);
                i++;
                j++;
                continue;
            }

        }

        String result = "";
        for (String row: rows)
            result += row;

        return result;
    }
}
