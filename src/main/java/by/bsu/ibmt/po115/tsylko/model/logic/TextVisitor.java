package by.bsu.ibmt.po115.tsylko.model.logic;

import by.bsu.ibmt.po115.tsylko.controller.Test;
import by.bsu.ibmt.po115.tsylko.model.entity.TextPart;
import by.bsu.ibmt.po115.tsylko.model.entity.Word;
import by.bsu.ibmt.po115.tsylko.model.entity.Visitor;
import by.bsu.ibmt.po115.tsylko.view.Printer;

/**
 * ClassName TextVisitor
 * This class implements a visitor interface and add behaviors to entities classes
 * Version 1.00
 * Date 22.01.2017 Powered by Tsylko_Andrei
 */

public class TextVisitor implements Visitor {
    @Override
    public void visit(TextPart textPart) {
    }

    @Override
    public void visit(Word word) {
        Printer.print(SubstringAnalyser.checkWord(word.toString(), Test.substring,Test.word));
    }
}

