package Question4;

public class CombineSentence {


    // main method
    public static void main(String[] args) {

        String sentence_one, sentence_two;

        // calling a static method
        sentence_one = "I like";
        sentence_two = getSecondSentence();

        // using non-static method
        CombineSentence objectThisClass = new CombineSentence();
        objectThisClass.addSentences(sentence_one, sentence_two);
    }

    // non static method
    void addSentences(String sentence_one, String sentence_two) {
        // returns void
        System.out.println(sentence_one + sentence_two);
    }


    // This is a static method
    static String getSecondSentence() {
        return " cooking pizza.";
    }
}