package by.bsu.ibmt.po115.tsylko.model.entity;

/**
 * InterfaceName Visitor
 * This interface uses for the visitor pattern, that provide an access to every element in a tree.
 * Version 1.00
 * Date 21.01.2017 Powered by Tsylko_Andrei
 */
public interface Visitor {
    void visit(TextPart textPart);
    void visit(Word word);
}