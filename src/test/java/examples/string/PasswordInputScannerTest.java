package examples.string;

import org.academiadecodigo.promptview.Prompt;
import org.academiadecodigo.promptview.scanners.string.PasswordInputScanner;

public class PasswordInputScannerTest {

    public static void main(String[] args) {

        Prompt prompt = new Prompt(System.in, System.out);
        PasswordInputScanner scanner = new PasswordInputScanner();

        System.out.println(prompt.getUserInput(scanner));

    }
}
