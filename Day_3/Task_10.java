package Day_3;
class TextEditor{
    String sentence="I love python Programming";

}

public class Task_10 {
    public static void main(String[] args) {
        TextEditor te=new TextEditor();
        System.out.println("Original sentance :"+te.sentence);
        System.out.println("Modified Sentence :"+te.sentence.replace("python", "Java"));
        System.out.println("Modified Sentence :"+te.sentence.replace("o", "0"));
        
    }
    
}
