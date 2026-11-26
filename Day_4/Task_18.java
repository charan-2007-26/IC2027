package Day_4;

import java.util.TreeMap;

public class Task_18 {
    public static void main(String[] args) {
        TreeMap<Integer,Integer> result=new TreeMap<>();
        //Store student roll numbers as keys and marks as values.
        result.put(01, 100);
        result.put(02, 90);
        result.put(03, 80);
        result.put(04, 98);
        //Add and update examination results.
        result.put(06, 99);
        result.put(05, 97);
        result.replace(04, 88);
        //Display all student results
        System.out.println(result.values());
        //Find the highest and lowest marks
        System.out.println("highest Marks "+result.firstEntry());
        System.out.println("Lowest marks "+result.lastEntry());
        System.out.println(result.subMap(2, 5));
        System.out.println(result.descendingKeySet());
        System.out.println(result.descendingMap());


        

    }
    
}
