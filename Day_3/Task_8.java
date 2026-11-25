package Day_3;
class WordAnalyzer{
    String word="Banana";
}

public class Task_8 {
    public static void main(String[] args) {
        WordAnalyzer wa=new WordAnalyzer();
        System.out.println("Last index of a :"+(wa.word).lastIndexOf("a"));
        System.out.println((wa.word).lastIndexOf("n"));
        System.out.println((wa.word).charAt((wa.word).lastIndexOf("a")));
        System.out.println((wa.word).charAt((wa.word).lastIndexOf("n")));
    }
    }
    

