package soundsystem;

import org.springframework.stereotype.Component;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/14
 */
@Component
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.print("Playing " + title + " by " + artist +"\n");
    }
}
