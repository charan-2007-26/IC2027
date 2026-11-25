import java.util.LinkedList;

public class LinkedList1{
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        
        System.out.println(num);

        num.remove(1);

        System.out.println(num);
    }
}