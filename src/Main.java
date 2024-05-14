import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        String paragraphText = "Policies of privatisation should be considered as responses to several distinct pressures. First, privatisation is a response by the state to internal forces such as increasing fiscal problems (O’Connor, 1973). It provides a means of lessening the state’s fiscal responsibilities by encouraging the development of private alternatives which, theoretically at least, do not draw upon the state’s financial reserves. Second, the promotion of private sector activity is a response to pressures originating ‘outside’ the state apparatus.";

        String[] sentences = paragraphText.split("\\. ");


        ArrayList<String> sentenceList = new ArrayList<>();


        for(String sentence : sentences)
            sentenceList.add(sentence);



        for (String sentence : sentenceList) {
            System.out.println(sentence);
        }


        int wordCount = sentences.length;
        System.out.println("Total sentences in the paragraph: " + wordCount);

        int totalCharacters = paragraphText.length();
        System.out.println("Total characters in the paragraph: " + totalCharacters);

        String[] words = paragraphText.split("\\s+");

        // Total words
        int totalWords = words.length;
        System.out.println("Total words in the paragraph: " + totalWords);

        Set<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            uniqueWords.add(word.toLowerCase());
        }
        System.out.println("Total unique words in the paragraph: " + uniqueWords.size());



    }
 }
