package LeetCode;

public class prefix {
    public static void main(String[] args) {
        String[] strs = new String[]{"flower", "flow", "flight"};
        String ch=strs[0].length() < 2 ?strs[0]  : strs[0].substring(0, 2);
        System.out.println(ch);
        for (String i : strs) {
            String text = i;
            if((text.length() < 2 ? text : text.substring(0, 2))==ch){
                System.out.println("true");
            }
        }
        
        System.out.println();
    }
    
}
