package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Discription: CD播放器
 * @Author: allen
 * @Date: 2017/7/13
 */
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }
}
