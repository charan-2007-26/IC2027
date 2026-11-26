package Day_4;

import java.util.TreeSet;

public class Task_10 {
    public static void main(String[] args) {
        TreeSet<Integer> score=new TreeSet<>();
        score.add(90);
        score.add(99);
        score.add(80);
        score.add(90);
        score.add(98);
        score.add(67);
        score.add(65);
        score.add(50);
        System.out.println(score);
        System.out.println("Lowest :"+score.first());
        System.out.println("Highest :"+score.last());
        System.out.println("immediate higher value :"+score.higher(score.getFirst()));
        System.out.println("immediate lower value :"+score.lower(score.getLast()));
        System.out.println(score.descendingSet());




    }
    
}
