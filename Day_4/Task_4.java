package Day_4;
import java.util.LinkedList;

public class Task_4 {
    public static void main(String[] args) {
        LinkedList<String> Song=new LinkedList<>();
        Song.add("Song2");
        Song.addFirst("Song1");
        Song.addLast("Song3");
        Song.add("Song2");
        Song.addFirst("Song1");
        Song.add("Song2");
        Song.addFirst("Song1");
        Song.removeFirst();
        Song.removeLast();
        System.out.println(Song);
        System.out.println(Song.getFirst());
        System.out.println(Song.getLast());
        System.out.println(Song.get(0));
        Song.removeFirst();
        Song.removeLast();
        System.out.println(Song);



    }
    
}
