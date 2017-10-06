package lt.setkus.cryptopals;

import lt.setkus.PrintUtils;

import static java.lang.System.out;

/**
 * http://www.developer.com/java/other/article.php/3386271/Understanding-Base64-Data.htm
 */
public class Challenge1 {

    public static String encodeBase64(String input) {
        out.println(input);

        int hex  = Integer.parseInt(input, 16);
        out.println("char: " + (char) hex);
        out.println("hex: " + hex);
        PrintUtils.printBinary(hex);

        int temp = hex;
        int result = (temp << 8) | hex;
        out.println(result);
        PrintUtils.printBinary(result);

        return null;
    }
}
