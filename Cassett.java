/**
 * @author Jayden Allen
 */
import java.util.ArrayList;


//Cassett Class that implements AnalogAlbum
public class Cassett implements AnalogAlbum{

    private ArrayList<String> songs;
    private int currentIndex;

    
/**
 * Constructor which takes in 5 song names and initializes them as a New cassett. 
 * @param song1
 * @param song2
 * @param song3
 * @param song4
 * @param song5
 */
    public  Cassett(String song1, String song2, String song3, String song4, String song5){
        songs = new ArrayList<String>();
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
    }
/**
 * Plays current song if not at the end of cassett.
 * @return String that states what song is playing or if you are at the end of the casett.
 */
    public String play(){
        if(currentIndex > 5)
            return "At the end of the Cassett you need to rewind";
        else
            currentIndex++;
            return "Playing song "+currentIndex+": "+songs.get(currentIndex-1);
            
        
        
    }
/**
 * Rewinds back as long as not at the first song
 * @return String to explain.
 */
    public String rewind(){
        if(currentIndex == 0)
            return "Fully Rewound";
        else {
            currentIndex--;
            return "Rewinding to song "+(currentIndex);

        }
        }
/**
 * Forwards to the next song
 * @return String to determine what song you forwarded to. 
 */
    public String ffwd(){
        if(currentIndex > 5){
            return "Forwarded to the end of the cassett";
        }else if(currentIndex < 5){
            currentIndex++;
            return "Forwarding to song "+(currentIndex+1);
        }else{
            return "At the end of the cassett you need to rewind";
        }
    }
/**
 * Pauses song
 * @return String that states the song is paused. 
 */
    public String pause(){
        return "Pausing...";
    }
/**
 * Stop and Eject Cassett
 * @return String that states the cassett is stopping and ejecting. 
 */
    public String stopEject(){
        return "Stopping cassett and ejecting";
    }

}
