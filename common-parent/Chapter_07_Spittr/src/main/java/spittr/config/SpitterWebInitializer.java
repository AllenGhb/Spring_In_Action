package spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/9/13
 */
public class SpitterWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{ RootConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{ "/" };
    }

    @Override
    protected  void customizeRegistration(Dynamic registration){
        registration.setMultipartConfig(
                new MultipartConfigElement("/tmp/spittr/uploads",2097152,4194304,0)
        );
    }

}
