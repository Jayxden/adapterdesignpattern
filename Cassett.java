import java.util.ArrayList;

import javax.lang.model.util.ElementScanner6;

public class Cassett {

    private ArrayList<String> songs;
    private int currentIndex;
    public Casset(String song1, String song2, String song3, String song4, String song5){
        songs = new ArrayList<String>();
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
    }

    public String play(){
        if(currentIndex > 5)
            return "At the end of the Cassett you need to rewind";
        else
            currentIndex++;
            return "Playing song "+currentIndex+": "+songs.get(currentIndex-1);
            
        
        
    }

    public String rewind(){
        if(currentIndex == 0)
            return "Fully Rewound";
        else {
            currentIndex--;
            return "Rewinding to song";

        }
        }

    public String ffwd(){
        if(currentIndex > 5){
            return "Forwarded to the end of the cassett";
        }else if(currentIndex < 5){
            currentIndex++;
            return "Forwarding to song";
        }else{
            return "At the end of the cassett you need to rewind";
        }
    }

    public String pause(){
        return "Pausing...";
    }

    public String stopEject(){
        return "Stopping cassett and ejecting";
    }

}
