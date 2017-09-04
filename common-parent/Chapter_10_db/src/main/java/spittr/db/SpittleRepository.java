package spittr.db;

import spittr.domain.Spitter;
import spittr.domain.Spittle;

import java.util.List;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/8/31
 */
public interface SpittleRepository {

    long count();

    List<Spittle> findRecent();

    List<Spittle> findRecent(int count);

    Spittle findOne(long id);

    Spittle save(Spittle spittle);

    List<Spittle> findBySpitterId(long spitterId);

    void delete(long id);

}
