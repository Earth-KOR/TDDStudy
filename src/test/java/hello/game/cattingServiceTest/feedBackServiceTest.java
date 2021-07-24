package hello.game.cattingServiceTest;

import hello.game.Entity.User;
import hello.game.Repository.Impl.UserRepositoryImpl;
import hello.game.Service.Impl.FeedBackServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
public class feedBackServiceTest {

    @Spy
    UserRepositoryImpl userRepository;

    @InjectMocks
    FeedBackServiceImpl feedBackService;

    @Test
    void sut_feedback_give_like_test() {

        //red

            //given
            User responseLikeUser = new User();
            responseLikeUser.setAmountOfLike(0L);
            responseLikeUser.setCount(10L);


            // 이러면 로직을 탄다
            //when(userRepository.applyLikeToUser(responseLikeUser, true)).thenReturn(responseLikeUser);

            // 이러면 로직을 안탄다
            doReturn(responseLikeUser).when(userRepository).applyLikeToUser(any(),any());
            doReturn(10L).when(userRepository).countFeedback(any());



            //when
            feedBackService.applyLikeToUser(responseLikeUser,true);


            //then
            Assertions.assertThat(responseLikeUser.getAmountOfLike()).isEqualTo(0L);
            Assertions.assertThat(responseLikeUser.getName()).isEqualTo("스파이 테스트");

        //green

            // service 수정


        //blue

            // 리펙토링 x
    }

    @Test
    void sut_feedback_give_like_count_limit_test() {

        //red

            //given
            User user = new User();
            doReturn(0L).when(userRepository).countFeedback(any());

            //when
            // then 으로 이관

            //then
            assertThrows(IllegalStateException.class, () -> { feedBackService.applyLikeToUser(user,true); });


        //green

            // service 수정

        //blue

            // 리펙토링 실시

    }


}
