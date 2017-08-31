public class ObjectsWordPairArray {
    public static void main(String[] args) {
        WordPair[] wordPairArray = new WordPair[3];
        wordPairArray[0] = new WordPair("class", "luokka");
        wordPairArray[1] = new WordPair("object", "olio");
        wordPairArray[2] = new WordPair("variable", "muuttuja");
        for (int i = 0; i < wordPairArray.length; i++) {
            System.out.println(wordPairArray[i].wordPairToString());
        }
    }
}
