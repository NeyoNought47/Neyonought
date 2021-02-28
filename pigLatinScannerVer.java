import java.util.Scanner;
public class pigLatinScannerVer {
    public static void main(String[] arg) {
        for (int i = 1; i > 0; i++) {
            Scanner word = new Scanner(System.in);
            System.out.println("Enter the word you wanna transform here: ");
            String input = word.nextLine();

            String firstLetter = input.substring(0, 1);
            String noFirst = input.substring(1);
            String pigLatin = noFirst + firstLetter + "ay";
            System.out.println(input + " in Pig Latin is " + pigLatin);
        }
    }
}
