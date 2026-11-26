package Day_4;


import java.util.LinkedHashSet;

public class Task_12 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> VisitorIDs=new LinkedHashSet<>();
        VisitorIDs.add(3243);
        VisitorIDs.add(3244);
        VisitorIDs.add(3245);
        VisitorIDs.add(3241);
        VisitorIDs.add(3242);
        VisitorIDs.add(3241);
        VisitorIDs.remove(0);
        System.out.println(VisitorIDs.contains(3242));
        System.out.println(VisitorIDs);
       
        

    }
    
}
