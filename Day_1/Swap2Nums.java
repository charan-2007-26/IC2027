package Day_1;

public class Swap2Nums {
    public static void main(String[] args) {
        int a=10;
        int b=50;
        System.out.println("Before swapping");
        System.out.println("a="+a+" b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping");
        System.out.println("a="+a+" b="+b);

    }
    
}
