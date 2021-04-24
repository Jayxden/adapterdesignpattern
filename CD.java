/**
 * CD class that implements DigitalAlbum
 * @author Jayden Allen
 */
import java.util.ArrayList;
public class CD implements DigitalAlbum {
    private ArrayList<String> songs;
    private int currentIndex;
/**
 * Constructor which takes in 5 song names and initializes them as a New Cd. 
 * @param song1
 * @param song2
 * @param song3
 * @param song4
 * @param song5
 */
    public CD(String song1, String song2, String song3, String song4, String song5){
        songs = new ArrayList<String>();
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
    }
    /**
     * Method that plays a song from the beginning.
     * @return String stating that the first song is playing. 
     */
    public String playFromBeginning(){
        currentIndex = 1;
        return "Playing song 1: "+songs.get(currentIndex-1);
    }

    /**
     * Method that takes in a int number and plays whatever song corresponds with the number.
     * @return String with the number and name of the song playing. 
     */
    public String playSong(int num){
        if(num > 0 && num < 6) {
            currentIndex = num;
            return "Playing "+num+": "+songs.get(num-1);
        }
        else{
            return "Invalid index";
        }
    }

    /**
     * Method that goes to previous song if not already at the beginning.
     * @return String explaining this. 
     */
    public String prevSong(){
        if(currentIndex == 0){
            return "CD already at beginning";
        }
        else{
            currentIndex--;
            return "Skipping back and playing: "+songs.get(currentIndex-1);
        }

    }

    /**
     * Method that goes to the next song if not already at the end. 
     * @return String explaing this. 
     */
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

    

    /**
     * method to pause songs
     * @return String stating that the song is pausing. 
     */
    public String pause(){
        return "Pausing...";
    }

    /**
     * Method to Stop the CD
     * @return String stating that the cd has stopped. 
     */
    public String stop() {
        return "Stopping...";
    }
}
