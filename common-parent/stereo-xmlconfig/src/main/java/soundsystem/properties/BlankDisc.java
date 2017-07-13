package soundsystem.properties;

import soundsystem.CompactDisc;

import java.util.List;

/**
 * @Discription: 空白光盘
 * @Author: allen
 * @Date: 2017/7/13
 */
public class BlankDisc implements CompactDisc{

    private String title;
    private String artist;
    private List<String> tracks;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        for (String track : tracks) {
            System.out.println("-Track: " + track);
        }
    }
}
