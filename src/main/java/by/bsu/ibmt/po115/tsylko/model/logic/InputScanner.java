package by.bsu.ibmt.po115.tsylko.model.logic;

import java.util.Scanner;

/**
 * ClassName InputScanner
 * This class allows to read an input from user.
 * Version 1.00
 * Date 22.01.2017 Powered by Tsylko_Andrei
 */
public class InputScanner {
    public static String[] scanInput() {
        String[] task = new String[3];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a text:");
        task[0] = in.nextLine();
        task[0] = addSpaces(task[0]);

        System.out.println("Enter a substring:");
        task[1] = in.nextLine();
        System.out.println("Enter a word,that you want to add:");
        task[2] = in.nextLine();
        return task;
    }

    private static String addSpaces(String text) {
        text = text.replaceAll("[.]", " . ");
        text = text.replaceAll("[,]", " , ");
        text = text.replaceAll("[?]", " ? ");
        text = text.replaceAll("[!]", " ! ");
        text = text.replaceAll("[;]", " ; ");
        text = text.replaceAll("[:]", " : ");
        return text;
    }
}
