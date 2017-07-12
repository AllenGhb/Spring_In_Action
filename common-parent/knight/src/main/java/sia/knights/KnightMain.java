package sia.knights;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sia.knights.config.KnightConfig;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/12
 */
public class KnightMain {

    public static void main(String[] args) {
        // 1：基于xml形式的装配
        ClassPathXmlApplicationContext xmlContext = new ClassPathXmlApplicationContext("META-INF/spring/knight.xml");
        Knight xmlKnight = xmlContext.getBean(Knight.class);
        xmlKnight.embarkOnQuest();
        xmlContext.close();
        // 2: 基于java形式的装配
        AnnotationConfigApplicationContext javaContext = new AnnotationConfigApplicationContext(KnightConfig.class);
        Knight javaKnight = javaContext.getBean(Knight.class);
        javaKnight.embarkOnQuest();
        javaContext.close();
        // 面向切面编程
        ClassPathXmlApplicationContext xmlContextAop = new ClassPathXmlApplicationContext("META-INF/spring/minstrel.xml");
        Knight xmlKnightAop = xmlContextAop.getBean(Knight.class);
        xmlKnightAop.embarkOnQuest();
        xmlContextAop.close();


    }

}
