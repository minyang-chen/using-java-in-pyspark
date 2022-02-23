package pyspark.java.udf;

import java.util.Arrays;

public class JavaTransformFunctions {
    public static void main(String[] args) throws Exception {
        //for (int i = 0; i < 10; ++i) {
        String str = JavaTransformFunctions.transformFieldValueEnding("415-9012-8080305772cf", 8, "#");
        System.out.println(str);
        //}
    }

    public static String transformFieldValueEnding(String token, Integer num, String replacement) throws Exception {
        /**
         * apply transformation on field values
         */
        if ((token != null) && (token.length() > 0) && (token.length() > num)) {
            char[] tokenChars = token.toCharArray();
            token.getChars(tokenChars.length - num, tokenChars.length, tokenChars, 0);
            System.out.println(tokenChars);
            Arrays.fill(tokenChars, num, tokenChars.length, replacement.charAt(0));
            return (new String(tokenChars));
        } else if (token.length() <= num) {
            // nothing to mask
            return token;
        }
        // empty token
        return "";
    }
}
