package lt.setkus;

public class PrintUtils {

    public static void printBinary(int input) {
        System.out.println(String.format("%8s", Integer.toBinaryString(input)).replace(' ', '0'));
    }
}
