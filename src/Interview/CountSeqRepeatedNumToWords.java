package Interview;

import java.util.HashMap;

public class CountSeqRepeatedNumToWords {
      /*
    Count the digits in the number and return back a verbal description of the results.
    The order of the digits must be preserved
    1112331
    output: three 1s, one 2, two 3s, one 1
     */

    public static void main(String[] args) {

        String str = "1223311233331";
        int repeated = 1, nonrepeated = 1;
        StringBuilder result = new StringBuilder();

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        int n = str.length();
        for (int i = 0; i < n - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                repeated++;
            }

            if (repeated > 1 && str.charAt(i) != str.charAt(i + 1)) {
                result.append(map.get(repeated)).append(" ").append(str.charAt(i)).append("s,");
                repeated = 1;
            }
            else if(repeated == 1) {
                result.append(map.get(nonrepeated)).append(" ").append(str.charAt(i)).append(",");
            }
            if (i + 1 == n - 1) {
                if (repeated > 1) {
                    result.append(map.get(repeated)).append(" ").append(str.charAt(i + 1)).append("s");
                } else {
                    result.append(map.get(nonrepeated)).append(" ").append(str.charAt(i + 1));
                }
            }
        }

        System.out.println(result);
    }
}
