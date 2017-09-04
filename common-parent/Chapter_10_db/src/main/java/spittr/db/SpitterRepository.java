package spittr.db;


import spittr.domain.Spitter;

import java.util.List;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/8/31
 */
public interface SpitterRepository {

    long count();

    Spitter save(Spitter spitter);

    Spitter findOne(long id);

    Spitter findByUsername(String username);

    List<Spitter> findAll();

}
