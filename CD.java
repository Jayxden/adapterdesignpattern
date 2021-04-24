import java.util.ArrayList;

public class CD implements DigitalAlbum {
    private ArrayList<String> songs;
    private int currentIndex;

    public CD(String song1, String song2, String song3, String song4, String song5){
        songs = new ArrayList<String>();
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
    }
    
    public String playFromBeginning(){
        currentIndex = 1;
        return "Playing song 1: "+songs.get(currentIndex-1);
    }

    public String playSong(int num){
        if(num > 0 && num < 6) {
            currentIndex = num;
            return "Playing "+num+": "+songs.get(num-1);
        }
        else{
            return "Invalid index";
        }
    }

    public String prevSong(){
        if(currentIndex == 0){
            return "CD already at beginning";
        }
        else{
            currentIndex--;
            return "Skipping back and playing: "+songs.get(currentIndex-1);
        }

    }

    public String nextSong(){
        if(currentIndex == 5){
            currentIndex = 1;
            return "Playing song 1: "+songs.get(currentIndex-1);
        }
        else {
            currentIndex++;
            return "Playing song "+currentIndex+": "+songs.get(currentIndex-1);
        }
    }    

    public String stopEject(){
        currentIndex = 1;
        return "Playing song 1: "+songs.get(currentIndex-1);
    }

    public String pause(){
        return "Pausing...";
    }

    @Override
    public String stop() {
        // TODO Auto-generated method stub
        return "Stopping...";
    }
}
