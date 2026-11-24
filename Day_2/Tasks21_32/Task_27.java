package Day_2.Tasks21_32;
interface Playable{
    void playMedia();
}
interface Downloadable{
    void DownloadMedia();
}class MusicPlayer implements Playable,Downloadable{
   public void playMedia(){
        System.out.println("Playing Music....");
    }
    public void DownloadMedia(){
        System.out.println("Downloading Music...");
    }
}

public class Task_27 {
    public static void main(String[] args) {
        MusicPlayer mp=new MusicPlayer();
        mp.playMedia();
        mp.DownloadMedia();
    }
    
}
