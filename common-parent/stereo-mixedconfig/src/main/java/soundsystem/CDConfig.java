package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/13
 */
@Configuration
public class CDConfig {

    @Bean
    public CompactDisc compactDisc(){
        return new SgtPeppers();
    }

}
