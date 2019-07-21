package app;

import java.util.HashMap;
import java.util.Scanner;


public class ACP {

   
    public static void main(String[] args) {
        AppControl.mapCommand("name", new DisplayName());
        AppControl.mapCommand("number", new DisplayNumber());
        AppControl.mapCommand("text", new DisplayText());

        String input = "";
        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("Enter command (q to quit) ");
            input = sc.nextLine();

            if (input.equals("q")) {
                continue;
            }

            String command = input;
            HashMap<String, Object> dataMap = new HashMap();
            AppControl.handleRequest(command, dataMap);
        }
        while (!input.equals("q"));

    }

}
