package hello.game.PPTtest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class PPTtest2 {

    @MockBean
    private UserService userService;

    @Test
    void test1() {
//        ApplicationContext ac = new AnnotationConfigApplicationContext();
//        System.out.println(ac.getBean("userService") + " Bean 체크");
        System.out.println(userService.test());
    }
}
