package Day_3;
class CharaterFinder{
    String Word="Programming";

}

public class Task_7 {
    public static void main(String[] args) {
        CharaterFinder cf=new CharaterFinder();
        System.out.println("first g word :"+(cf.Word).indexOf('g'));
        System.out.println("position of M"+(cf.Word).indexOf('m')+" Position");
        System.out.println((cf.Word).contains("z"));
    }
    
}
