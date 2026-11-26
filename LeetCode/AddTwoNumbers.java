package LeetCode;

import java.util.LinkedList;

public class AddTwoNumbers {
    public static void main(String[] args) {
        LinkedList <Integer> l1=new LinkedList<>();
        l1.add(2);
        l1.add(4);
        l1.add(3);
        LinkedList <Integer> l2=new LinkedList<>();
        l2.add(5);
        l2.add(6);
        l2.add(4);
        System.out.println(l1);
        System.out.println(l2);
        StringBuilder sb=new StringBuilder();
        for (Integer i : l1) {
            sb.append(i);
        }
        System.out.println(sb.reverse());
        int number = Integer.parseInt(sb.toString());
        System.out.println(number+465);


    }
    
}
