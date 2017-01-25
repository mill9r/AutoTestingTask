package by.bsu.ibmt.po115.tsylko.model.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName TextPart
 * This class inherits a base class TextComponent. This nodes class is define behavior
 * of the components having children and to store children components.
 * This class also overrides an accept() method, that give a link to node and children classes.
 * Version 1.00
 * Date 21.01.2017 Powered by Tsylko_Andrei
 */
public class TextPart extends TextComponent {

    private List<TextComponent> element;

    public TextPart() {
        element = new ArrayList<TextComponent>();
    }

    public void addElement(TextComponent part) {
        element.add(part);
    }

    public void removeElement(TextComponent part) {
        element.remove(part);
    }

    public TextComponent getElement(int index) {
        return element.get(index);
    }

    private void acceptChildren(Visitor visitor) {
        for (int i = 0; i < element.size(); i++) {
            element.get(i).accept(visitor);
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        acceptChildren(visitor);
    }

    public TextComponent getChild(int i) {
        return element.get(i);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (TextComponent e : element) {
            stringBuilder.append(e + " ");
        }
        return stringBuilder.toString();
    }
}