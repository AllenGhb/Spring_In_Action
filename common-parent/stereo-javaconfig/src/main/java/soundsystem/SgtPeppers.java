package soundsystem;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/13
 */
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
