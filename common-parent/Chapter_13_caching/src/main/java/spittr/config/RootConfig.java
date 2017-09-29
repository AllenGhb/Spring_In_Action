package spittr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/9/4
 */
@Configuration
@ComponentScan("spittr.db")
@Import({DataConfig.class,CachingConfig.class})
public class RootConfig {
}
