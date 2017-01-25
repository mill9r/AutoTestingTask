package by.bsu.ibmt.po115.tsylko.controller;

import by.bsu.ibmt.po115.tsylko.model.entity.TextComponent;
import by.bsu.ibmt.po115.tsylko.model.logic.TextVisitor;
import by.bsu.ibmt.po115.tsylko.model.logic.InputScanner;
import by.bsu.ibmt.po115.tsylko.model.logic.TextParser;


/**
 * ClassName Test
 * This class is used for testing this program
 * Version 1.00
 * Date 21.01.2017 Powered by Tsylko_Andrei
 */
public class Test {
    public static String substring;
    public static String word;

    public static void main(String[] args) {
        String[] text = InputScanner.scanInput();
        substring = text[1];
        word = text[2];
        TextParser textParser = new TextParser();
        TextComponent component = textParser.parse(text[0]);
        component.accept(new TextVisitor());
    }
}
