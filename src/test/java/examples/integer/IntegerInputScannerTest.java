package examples.integer;

import org.academiadecodigo.promptview.Prompt;
import org.academiadecodigo.promptview.scanners.integer.IntegerInputScanner;

public class IntegerInputScannerTest {

    public static void main(String[] args) {

        Prompt prompt = new Prompt(System.in, System.out);
        IntegerInputScanner scanner = new IntegerInputScanner();

        System.out.println(prompt.getUserInput(scanner));

    }
}
