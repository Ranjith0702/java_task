package Task_2;

public class trimVsStrip {
    public static void main(String[] args) {
        String str = "\u2000July, Born!  \n";
        String trimmedStr = str.trim();
        String strippedStr = str.strip();

        System.out.println(trimmedStr); // "Hello, world!"
        System.out.println(strippedStr); // "Hello, world!"
    }
}
