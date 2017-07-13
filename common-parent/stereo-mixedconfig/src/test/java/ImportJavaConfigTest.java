import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import soundsystem.MediaPlayer;

import static org.junit.Assert.assertEquals;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/13
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:cdplayer-config.xml")
public class ImportJavaConfigTest {

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private MediaPlayer player;

    @Test
    public void play() {
        player.play();
        assertEquals(
                "Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\n",
                log.getLog());
    }

}
