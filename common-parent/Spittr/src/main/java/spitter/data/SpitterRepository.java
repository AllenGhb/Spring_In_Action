package spitter.data;

import spitter.Spitter;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/17
 */
public interface SpitterRepository {

    Spitter save(Spitter spitter);

    Spitter findByUsername(String username);

}
