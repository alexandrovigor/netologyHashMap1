import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {
    Set<String> allWordsOfText;
    String textLow;

    public WordsChecker(String text) {
        textLow = text.toLowerCase();
        allWordsOfText = new HashSet<>(List.of(textLow.split("\\P{IsAlphabetic}+")));
    }

    public boolean hasWords(String anyWord) {
        String word = anyWord.toLowerCase();
        return allWordsOfText.contains(word);
    }
}
