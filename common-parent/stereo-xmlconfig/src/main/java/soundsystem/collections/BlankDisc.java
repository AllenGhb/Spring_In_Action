package soundsystem.collections;

import soundsystem.CompactDisc;

import java.util.List;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/13
 */
public class BlankDisc implements CompactDisc {

    private String title;
    private String artist;
    private List<String> tracks;

    public BlankDisc(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    @Override
    public void play() {
        System.out.print("Playing " + title + " by " + artist + "\n");
        for(String track : tracks){
            System.out.print("-Track: " + track + "\n");
        }
    }
}
