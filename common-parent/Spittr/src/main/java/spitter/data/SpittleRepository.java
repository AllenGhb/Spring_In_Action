package spitter.data;

import spitter.Spittle;

import java.util.List;


/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/17
 */
public interface SpittleRepository {

    List<Spittle> findRecentSpittles();

    List<Spittle> findSpittles(long max,int count);

    Spittle findOne(long id);

    void save(Spittle spittle);

}
