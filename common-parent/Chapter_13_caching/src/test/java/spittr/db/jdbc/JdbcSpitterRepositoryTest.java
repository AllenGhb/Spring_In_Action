package spittr.db.jdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import spittr.config.RootConfig;
import spittr.db.SpitterRepository;
import spittr.domain.Spitter;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/9/4
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=RootConfig.class)
public class JdbcSpitterRepositoryTest {

    @Autowired
    SpitterRepository spitterRepository;

    private static Spitter[] SPITTERS = new Spitter[6];

    @Test
    public void count() {
        assertEquals(4, spitterRepository.count());
    }

    private static void assertSpitter(int expectedSpitterIndex, Spitter actual, String expectedStatus) {
        Spitter expected = SPITTERS[expectedSpitterIndex];
        assertEquals(expected.getId(), actual.getId());
        assertEquals(expected.getUsername(), actual.getUsername());
        assertEquals(expected.getPassword(), actual.getPassword());
        assertEquals(expected.getFullName(), actual.getFullName());
        assertEquals(expected.getEmail(), actual.getEmail());
        assertEquals(expected.isUpdateByEmail(), actual.isUpdateByEmail());
    }

    private static void assertSpitter(int expectedSpitterIndex, Spitter actual) {
        assertSpitter(expectedSpitterIndex, actual, "Newbie");
    }

    @Test
    @Transactional
    public void findAll() {
        List<Spitter> spitters = spitterRepository.findAll();
        assertEquals(4, spitters.size());
        assertSpitter(0, spitters.get(0));
        assertSpitter(1, spitters.get(1));
        assertSpitter(2, spitters.get(2));
        assertSpitter(3, spitters.get(3));
    }
}
