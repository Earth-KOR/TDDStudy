package hello.game.PPTtest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class PPTtest {


    @Test
    void PPTtest1 () {

        UserService userService = spy(UserService.class);

        when(userService.test()).thenReturn("stub 출력");

        System.out.println(userService.test() + " PPT Test");
        System.out.println(userService.test2() + " PPT Test");
    }


}



