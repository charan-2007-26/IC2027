package Day_3;

public class Task_1 {
    public static void main(String[] args) {
        //Find the length og a given string
        String name="Charan";
        System.out.println(name.length());
        //convert a string into uppercase and lowercase
        String Title="Well Shade";
        System.out.println("Lowercase :"+Title.toLowerCase()+"\n Uppercase :"+Title.toUpperCase());
        //Count the number of characters in a String
        String Word="Go to hell";
        int count=0;
        for(int i=0;i<Word.length();i++){
            count+=1;
    }
    System.out.println("Count :"+count);
    //print each character in a string
    String str="Cherry";
    for(int i=0;i<str.length();i++){
        System.out.println(str.charAt(i));
    }
    //check whether two strings are equal
    String str1="java";
    String str2="java";
    System.out.println(str1==str2);
    System.out.println(str1.equals(str2));
    
}
}
