public class Main {
    public static void main(String[] args) {
        // Stores 3 strings.
        String[] splitString = "Hello World again".split(" ");

        // Prints elements of array splitString.
        printText(splitString);

        // Prints the divider.
        System.out.println("-".repeat(20));

        // Prints variable arguments.
        printTextVarArgs("Hello", "World", "again");

        // Prints the divider.
        System.out.println("-".repeat(20));

        // Prints nothing as no variable argument has passed.
        printTextVarArgs();
    }

    /**
     * Prints contents of array.
     */
    private static void printText(String[] textList) {
        for (String t : textList) {
            System.out.println(t);
        }
    }

    /**
     * Prints variable arguments.
     */
    private static void printTextVarArgs(String... textList) {
        printText(textList);
    }
}