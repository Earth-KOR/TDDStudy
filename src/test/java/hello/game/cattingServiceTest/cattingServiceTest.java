package hello.game.cattingServiceTest;

import hello.game.Entity.User;
import hello.game.Enum.MemberShip;
import hello.game.Repository.UserRepository;
import hello.game.Service.CattingService;
import hello.game.Service.Impl.CattingServiceImpl;
import hello.game.Service.Impl.UserServiceImpl;
import hello.game.Service.UserService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class cattingServiceTest {

    @Mock
    UserService userService;

    @Mock
    UserRepository userRepository;

    @InjectMocks
    CattingServiceImpl cattingService;

    @Test
    void normal_user_matting_catting() throws Exception {

        //red

            //given
            User requestUser = new User(); // 랜덤채팅을 신청한 유저
            User responseUser = new User(MemberShip.NORMAR); // 랜덤채팅 상대
            when(userService.findOneUser(any())).thenReturn(responseUser);

            //when
            responseUser = cattingService.randomMatting(requestUser);

            //then
            Assertions.assertThat(responseUser.getMemberShip()).isEqualTo(MemberShip.NORMAR);

        // green

            // Service 로직 수정하기

        //blue

            // 리펙토링 --> x
    }


    @Test
    void normal_user_matting_catting_insert_db() throws Exception {

        //red

            //given
            List<User> mattingUserList = new ArrayList<>();
            User requestUser = new User(); // 랜덤채팅을 신청한 유저
            User responseUser = new User(MemberShip.NORMAR); // 랜덤채팅 상대
            mattingUserList.add(requestUser);
            mattingUserList.add(responseUser);
            when(userRepository.insertMattingUserList(mattingUserList)).thenReturn(1L);
            when(userService.findOneUser(any())).thenReturn(responseUser);

            //when
            responseUser = cattingService.randomMatting(requestUser);

            //then
            Assertions.assertThat(responseUser.getMemberShip()).isEqualTo(MemberShip.NORMAR);


        // green

             // Service 로직 수정하기


        //blue

             // 리펙토링 --> 메서드를 분리 하자!

    }


//    @Test
//    void normal_user_matting_catting_insert_db_Exception() throws Exception {
//
//        //red
//
//            //given
//            List<User> mattingUserList = new ArrayList<>();
//            User requestUser = new User(); // 랜덤채팅을 신청한 유저
//            User responseUser = new User(MemberShip.NORMAR); // 랜덤채팅 상대
//            mattingUserList.add(requestUser);
//            mattingUserList.add(responseUser);
//            when(userRepository.insertMattingUserList(mattingUserList)).thenThrow(new Exception());
//            when(userService.findOneUser(any())).thenReturn(responseUser);
//
//            //when
//            responseUser = cattingService.randomMatting(requestUser);  // --> 입센션 받음
//
//            //then
//
//
//
//        // green
//
//            // Service 로직 수정하기
//
//
//        //blue
//
//            // 리펙토링 x
//
//    }





}
