import java.util.Scanner;
public class Easy1 {
    public static int lengthOfLastWord(String s) {
        String[] words = s.split("\\s+");

        if (words.length > 0) {
            return words[words.length - 1].length();
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");

        String s = scanner.nextLine();

        scanner.close();

        int result = lengthOfLastWord(s);
        System.out.println("Length of the last word : " + result);
    }
}

