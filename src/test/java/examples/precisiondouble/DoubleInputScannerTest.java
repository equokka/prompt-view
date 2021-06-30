package examples.precisiondouble;

import org.academiadecodigo.promptview.Prompt;
import org.academiadecodigo.promptview.scanners.precisiondouble.DoubleInputScanner;

public class DoubleInputScannerTest {

    public static void main(String[] args) {

        Prompt prompt = new Prompt(System.in, System.out);
        DoubleInputScanner scanner = new DoubleInputScanner();

        System.out.println(prompt.getUserInput(scanner));

    }
}
