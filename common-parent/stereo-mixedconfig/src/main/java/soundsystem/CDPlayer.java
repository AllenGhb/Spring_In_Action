package soundsystem;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/13
 */
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }
}
