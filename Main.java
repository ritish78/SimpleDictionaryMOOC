
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       SimpleDictionary dictionary = new SimpleDictionary();
       
       TextUI ui = new TextUI(scanner, dictionary);
       ui.start();
       //Here, you can implement method to print the translated word
       //The word that is printed will have to be provided in the runtime of the program.
       //eg. System.out.println(dictionary.translate("message"));

    }
}
