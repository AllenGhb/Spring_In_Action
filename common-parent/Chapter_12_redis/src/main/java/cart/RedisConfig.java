package cart;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/9/4
 */
@Configuration
public class RedisConfig {

    @Bean
    public RedisConnectionFactory redisCF(){
        return new JedisConnectionFactory();
    }

    @Bean
    public RedisTemplate<String,Product> redisTemplate(RedisConnectionFactory cf){
        RedisTemplate<String,Product> redis = new RedisTemplate<>();
        redis.setConnectionFactory(cf);
        return redis;
    }

}
