package by.bsu.ibmt.po115.tsylko.model.entity;

/**
 * ClassName Word
 * This class inherits a base class TextComponent. This class defines the behavior
 * for the elements in the composition. It does this by implementing the operations the Composite supports
 * This class also overrides an accept() method, that give a link to this classes.
 * Version 1.02
 * Date 21.01.2017 Powered by Tsylko_Andrei
 */
public class Word extends TextComponent {

    private String text;

    public Word(String text) {
        this.text = text;
    }

    public TextComponent getElement(int index) {
        return this;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return text;
    }

}

