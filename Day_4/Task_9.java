package Day_4;

import java.util.TreeSet;

public class Task_9 {
    public static void main(String[] args) {
        TreeSet<Integer> IDs=new TreeSet<>();
        IDs.add(3241);
         IDs.add(3241);
        IDs.add(3242);
        IDs.add(3243);
        IDs.add(3244);
        IDs.add(3245);
        IDs.add(3246);
        IDs.add(3241);
        IDs.add(3241);
        System.out.println("Smallest id :"+IDs.first());
        System.out.println("largest id :"+IDs.last());
        IDs.remove(3241);
        System.out.println(IDs);
        System.out.println(IDs.higher(IDs.getFirst()));
        System.out.println(IDs.lower(IDs.last()));
        System.out.println(IDs.headSet(IDs.higher(IDs.getFirst())));
         System.out.println(IDs.tailSet(IDs.higher(IDs.getFirst())));
          System.out.println(IDs.subSet(3242, 3245));
    }   
    
}
