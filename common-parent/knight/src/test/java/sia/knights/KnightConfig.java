package sia.knights;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.PrintStream;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/12
 */
@Configuration
public class KnightConfig {

    @Bean
    public Knight knight(){
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest(){
        return new SlayDragonQuest(stream());
    }

    @Bean
    public PrintStream stream(){
        return new FakePrintStream();
    }


}
