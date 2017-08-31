public class ObjectsWordPairProgram {
    public static void main(String[] args) {
        WordPair firstWord = new WordPair("class", "luokka");
        WordPair secondWord = new WordPair("object", "olio");
        WordPair thirdWord = new WordPair("variable", "muuttuja");
        System.out.println(firstWord.getEnglishWord() + " = " + firstWord.getFinnishWord());
        System.out.println(secondWord.getEnglishWord() + " = " + secondWord.getFinnishWord());
        System.out.println(thirdWord.getEnglishWord() + " = " + thirdWord.getFinnishWord());
    }
}
