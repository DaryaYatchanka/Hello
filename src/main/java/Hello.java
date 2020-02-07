import java.util.Arrays;

public class Hello {

    public String isAnogram(String str1, String str2) {
        String copyOfStr1 = str1.replaceAll(" ", "").toLowerCase();
        String copyOfStr2 = str2.replaceAll(" ", "").toLowerCase();
        if (copyOfStr1.length() != copyOfStr2.length()) {
            return "No";
        }
        char[] arrayStr1 = copyOfStr1.toCharArray();
        char[] arrayStr2 = copyOfStr2.toCharArray();

        Arrays.sort(arrayStr1);
        Arrays.sort(arrayStr2);
        if (Arrays.equals(arrayStr1, arrayStr2)) {
            return "Yes";
        } else {
            return "No";
        }
    }

}
