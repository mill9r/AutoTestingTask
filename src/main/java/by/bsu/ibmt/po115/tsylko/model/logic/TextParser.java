package by.bsu.ibmt.po115.tsylko.model.logic;

import by.bsu.ibmt.po115.tsylko.model.entity.TextComponent;
import by.bsu.ibmt.po115.tsylko.model.entity.TextPart;
import by.bsu.ibmt.po115.tsylko.model.entity.TextType;
import by.bsu.ibmt.po115.tsylko.model.entity.Word;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ClassName TextParser
 * This class parses text to elements and add it to composite's nodes and leaves.
 * Version 1.02
 * Date 23.01.2017 Powered by Tsylko_Andrei
 */
public class TextParser {
    public TextComponent parse(String text) {
        TextComponent wholeText = new TextPart();
        wholeText = parseToSentence(wholeText, text);
        return wholeText;
    }

    public TextComponent parseToSentence(TextComponent wholeText, String text) {
        TextComponent sentenceList = new TextPart();
        Pattern patternSentence = Pattern.compile(TextType.SENTENCE.getReg());
        Matcher matcher = patternSentence.matcher(text);
        while (matcher.find()) {
            sentenceList = parseToWord(sentenceList, matcher.group());

        }
        wholeText.addElement(sentenceList);
        return wholeText;
    }

    public TextComponent parseToWord(TextComponent sentenceList, String text) {
        TextComponent word;
        Pattern patternSentence = Pattern.compile(TextType.WORD.getReg());
        Matcher matcher = patternSentence.matcher(text);
        while (matcher.find()) {
            word = new Word(matcher.group());
            sentenceList.addElement(word);
        }
        return sentenceList;
    }

}
