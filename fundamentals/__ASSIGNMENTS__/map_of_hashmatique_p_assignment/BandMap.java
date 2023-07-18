package fundamentals.__assignments__.map_of_hashmatique_p_assignment;

import java.util.Set;
import java.util.HashMap;


public class BandMap {
    
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Fallingforyou", "What time you coming down?");
        trackList.put("She's American", "Your face has got a hold on me");
        trackList.put("M.O.N.E.Y", "M.O.N.E.Y is me, M.O.N.E.Y");
        trackList.put("Happiness", "She showed me what love is");

        String songLyrics = trackList.get("M.O.N.E.Y");
        System.out.println(songLyrics);

        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.printf("\n\nTRACK: '%s' , LYRICS: '%s' ", key, trackList.get(key));
        }
    }
}
