package string;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String string = "  Hello ";

        // trim() will remove white spaces from beginning and end of the string.
        String str = string.trim();
        int len = str.length();
        System.out.println("Length of the String: " + len);

        // string to char array
        char[] s = str.toCharArray();
        System.out.println(Arrays.toString(s));

        for(int i = len -1;i>=0;i--){
            System.out.print(s[i]);
        }

    }
}
