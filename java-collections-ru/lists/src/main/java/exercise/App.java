package exercise;


import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String symbols, String word) {
        var anyWord = word.toLowerCase();
        char[] symbolsArray = symbols.toCharArray();
        char[] wordArray = anyWord.toCharArray();
        List<Character> listSymbols = new ArrayList<>();
        List<Character> listWord = new ArrayList<>();

        for (char w: wordArray) {
            listWord.add(w);
        }
        for (char s: symbolsArray) {
            if (listWord.contains(s)) {
                listSymbols.add(s);
            }
        }
        for (char c: listWord) {
            if (listSymbols.contains(c)) {
                listSymbols.remove(c);
            } else {
                return false;
            }
        }
        return listSymbols.isEmpty();
    }
}
//END
