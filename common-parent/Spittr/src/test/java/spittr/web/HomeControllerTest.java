package spittr.web;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import spitter.web.HomeController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/21
 */
public class HomeControllerTest {

    @Test
    public void testHomePage() throws  Exception{
        HomeController controller = new HomeController();
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/")).andExpect(view().name("home"));
    }
}
