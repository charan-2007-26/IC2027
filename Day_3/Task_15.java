package Day_3;
class FileValidiator{
    void validate(String filename){
        if(filename.endsWith(".pdf")){
            System.out.println("PDF File");
        
        }else if(filename.endsWith(".jpg")){
            System.out.println("jpg File");
        }else if(filename.endsWith(".docx")){
            System.out.println("DOCX file");
        }
        else{
            System.out.println("Different File Format");
        }
    }
}

public class Task_15 {
    public static void main(String[] args) {
        FileValidiator fv=new FileValidiator();
        fv.validate("Charan.pdf");
        fv.validate("Charan.jpg");
        fv.validate("Charan.docx");
        
    }
    
}
