package Calculator;

import java.util.Scanner;

public class ReadInput {
    public static String read() {
        Scanner a = new Scanner(System.in);
        System.out.println("Input Expression Example:  4*3/2");
        String inputline = a.nextLine();
        a.close();
        return inputline;

    }
}
