package lt.setkus.cryptopals;

import static java.lang.System.out;

/**
 * http://www.developer.com/java/other/article.php/3386271/Understanding-Base64-Data.htm
 */
public class Challenge1 {

    public static String encodeBase64(String input) {
        out.println(input);

        int hex = Character.digit(input.charAt(0), 16);
        out.println("hex: " + hex);

        return null;
    }
}
