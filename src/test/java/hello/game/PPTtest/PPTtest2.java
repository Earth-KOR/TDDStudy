package hello.game.PPTtest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PPTtest2 {

    private final UserService userService;

    public PPTtest2(UserService userService) {
        this.userService = userService;
    }

    @Test
    void test1() {
       System.out.println(userService.test());
    }
}
