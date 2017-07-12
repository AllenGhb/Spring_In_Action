package sia.knights;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/12
 */
public class KnightMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/knight.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();

    }

}
