package pre;

public class GetCharacterFromString {
    public static void main(String[] args) {
        String sentence = "文字の取りだしは簡単";
        System.out.printf("文字列 \"%s\" の最初の文字は「%c」, 3文字目は「%c」\n", sentence, sentence.charAt(0), sentence.charAt(2));
    }
}
