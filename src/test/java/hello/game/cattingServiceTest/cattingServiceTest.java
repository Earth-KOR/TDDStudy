package hello.game.cattingServiceTest;

import hello.game.Entity.User;
import hello.game.Enum.MemberShip;
import hello.game.Repository.UserRepository;
import hello.game.Service.Impl.CattingServiceImpl;
import hello.game.Service.UserService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
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


    @Test
    void normal_user_matting_catting_insert_db_Exception() throws Exception {

        //red

            //given
            List<User> mattingUserList = new ArrayList<>();
            User requestUser = new User(); // 랜덤채팅을 신청한 유저
            User responseUser = new User(MemberShip.NORMAR); // 랜덤채팅 상대
            mattingUserList.add(requestUser);
            mattingUserList.add(responseUser);
            when(userRepository.insertMattingUserList(mattingUserList)).thenThrow(new IllegalStateException());
            when(userService.findOneUser(any())).thenReturn(responseUser);

            //when
            //then 으로 이관

            //then
            assertThrows(IllegalStateException.class, () -> { cattingService.randomMatting(requestUser); });


        // green

            // Service 로직 수정하기


        //blue

            // 리펙토링 x
    }

    @Test
    void sut_premium_user_matting_test() {

        //red

            //given
            User requestUser = new User(); // 유료 매칭 신청자
            User firstOfResponseUser = new User();
            User secondOfResponseUser = new User();
            User thirdOfResponseUser = new User();
            List<User> findListUser = new ArrayList<>();

            firstOfResponseUser.setAmountOfLike(5L);
            secondOfResponseUser.setAmountOfLike(10L);
            thirdOfResponseUser.setAmountOfLike(15L);
            thirdOfResponseUser.setName("이상권");

            findListUser.add(firstOfResponseUser);
            findListUser.add(secondOfResponseUser);
            findListUser.add(thirdOfResponseUser);

            when(userRepository.findMostLikedUser()).thenReturn(findListUser);


            //when
            List<User> amountOfLikedUser = cattingService.PremiumRandomMatting(requestUser);

            //then
            Assertions.assertThat(amountOfLikedUser.stream().anyMatch(opt -> opt.getAmountOfLike() == 15)).isTrue();


        //green

            // Service 수정

        //blue

            // 리펙토링 x
    }


    @Test
    void sut_premium_user_matting_payment_test() {

        //red

            //given
            User premiumUser = new User();
            premiumUser.setAmountOfPurchase(0L);
            premiumUser.setName("이상권");

            User firstOfResponseUser = new User();
            User secondOfResponseUser = new User();
            User thirdOfResponseUser = new User();
            List<User> findListUser = new ArrayList<>();

            firstOfResponseUser.setAmountOfLike(5L);
            secondOfResponseUser.setAmountOfLike(10L);
            thirdOfResponseUser.setAmountOfLike(15L);

            findListUser.add(firstOfResponseUser);
            findListUser.add(secondOfResponseUser);
            findListUser.add(thirdOfResponseUser);

            when(userRepository.payPayment(premiumUser)).thenReturn(5000L);
            when(userRepository.findMostLikedUser()).thenReturn(findListUser);
//            when(userRepository.updateMembership(premiumUser)).thenReturn("VIP");

            //when
            List<User> mattingUserList = cattingService.PremiumRandomMatting(premiumUser);
            User user = mattingUserList.stream().filter(opt -> opt.getName() == "이상권").findFirst().get();

            //then
            Assertions.assertThat(user.getAmountOfPurchase()).isEqualTo(5000L);


        //green

            // Service 로직 수정
    }


    @Test
    void sut_premium_user_matting_membership_test() {

        //red

            //given
            User premiumUser = new User();
            premiumUser.setMemberShip(MemberShip.NORMAR);
            premiumUser.setName("이상권");

            User firstOfResponseUser = new User();
            User secondOfResponseUser = new User();
            User thirdOfResponseUser = new User();
            List<User> findListUser = new ArrayList<>();

            firstOfResponseUser.setAmountOfLike(5L);
            secondOfResponseUser.setAmountOfLike(10L);
            thirdOfResponseUser.setAmountOfLike(15L);

            findListUser.add(firstOfResponseUser);
            findListUser.add(secondOfResponseUser);
            findListUser.add(thirdOfResponseUser);

            when(userRepository.findMostLikedUser()).thenReturn(findListUser);
            when(userRepository.updateMembership(premiumUser)).thenReturn(MemberShip.VIP);

            //when
            List<User> mattingUserList = cattingService.PremiumRandomMatting(premiumUser);
            User user = mattingUserList.stream().filter(opt -> opt.getName() == "이상권").findFirst().get();

            //then
            Assertions.assertThat(user.getMemberShip()).isEqualTo(MemberShip.VIP);


    }





}
