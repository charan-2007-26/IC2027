package Day_3;
class WebsiteValidator{
    void securecheck(String url){
        if(url.startsWith("https://")){
            System.out.println("Secure website URL");
        }else{
            System.out.println("Invalid Website Protocol");
        }
    }
}

public class Task_14 {
    public static void main(String[] args) {
        WebsiteValidator wv=new WebsiteValidator();
        wv.securecheck("https://ssms.saranv.in/student/tasks");
    }
    
}
