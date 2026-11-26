package Day_4;

import java.util.ArrayList;
import java.util.Collections;

public class Task_6 {
    public static void main(String[] args) {
        ArrayList<Integer> prices=new ArrayList<>();
        prices.add(100);
        prices.add(50);
        prices.add(150);
        prices.add(55);
        prices.add(105);
        prices.add(60);
        prices.add(90);
        prices.add(70);
        prices.add(450);
        prices.add(550);
        System.out.println(prices);
        prices.set(4 ,120);
        System.out.println("Highest Price: "+Collections.max(prices));
        System.out.println("Lowest Price: "+Collections.min(prices));
        Collections.sort(prices);
        System.out.println(prices);


    }
    
}
