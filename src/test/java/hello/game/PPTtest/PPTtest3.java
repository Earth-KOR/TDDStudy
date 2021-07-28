package hello.game.PPTtest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PPTtest3 {

//    @Spy
//    UserService userService ;

    @InjectMocks
    UserService2 userService2;

    @Test
    void test() {
        userService2.test();
    }
}
