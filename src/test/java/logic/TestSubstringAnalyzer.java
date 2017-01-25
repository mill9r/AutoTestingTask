package logic;


import by.bsu.ibmt.po115.tsylko.model.logic.SubstringAnalyser;
import org.junit.Assert;
import org.junit.Test;

public class TestSubstringAnalyzer {
    @Test
    public void testCheckWordPositive(){
        String word = "sentence ";
        String substring = "ce";
        String additionalWord = "monkey";
        if(!"sentence monkey ".equals(SubstringAnalyser.checkWord(word,substring,additionalWord))){
            Assert.fail();
        }
    }
    @Test
    public void testCheckWordNegative(){
        String word = "sentence ";
        String substring = "te";
        String additionalWord = "monkey";
        if(!"sentence ".equals(SubstringAnalyser.checkWord(word,substring,additionalWord))){
            Assert.fail();
        }
    }
}
