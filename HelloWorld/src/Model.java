public class Model {
    private String sentence;

    public String addToSentence(String word){
        return sentence += word;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }
}
