package Day_2;
interface Printable{
    public void printDocument();

}interface Scannable{
    public void ScanDocument();
}
class SmartPrinter implements Printable,Scannable{
    @Override 
   public void printDocument(){
    System.out.println("Printing Document");

   }
   public  void ScanDocument(){
    System.out.println("Scanning Document");

   } 
}

public class Task_15 {
    public static void main(String[] args) {
        SmartPrinter sp=new SmartPrinter();
        sp.printDocument();
        sp.ScanDocument();
        
    }
    
}
