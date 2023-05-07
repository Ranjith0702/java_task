package Task_2;

public class leadingVstrailing {
        public static void main(String[] args) {
            String str = "    hello, world!    ";

            String strippedLeading = str.stripLeading();
            String strippedTrailing = str.stripTrailing();

            System.out.println(strippedLeading); // "hello, world!    "
            System.out.println(strippedTrailing); // "    hello, world!"

        }
    }
