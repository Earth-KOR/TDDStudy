package hello.game.Service.Impl;

import hello.game.Entity.User;
import hello.game.Enum.MemberShip;
import hello.game.Repository.UserRepository;
import hello.game.Service.CattingService;
import hello.game.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class CattingServiceImpl implements CattingService {

    private final UserService userService;
    private final UserRepository userRepository;

    @Override
    public User randomMatting(User user) throws Exception {

        List<User> mattingUserList = new ArrayList<>();

        User responseUser = userService.findOneUser(MemberShip.NORMAR);

        mattingUserList.add(user);
        mattingUserList.add(responseUser);

        //CASE 1
        //        userRepository.insertMattingUserList(mattingUserList)

        //CASE 2
        //         insertMattingUserDB(mattingUserList);

        //CASE 3
        try {
            insertMattingUserDB(mattingUserList);
        }catch (Exception e) {
            System.out.println("채팅방 입장에 실패하였습니다.");
        }

        return responseUser;
    }

    //CASE 2 && 3
    private void insertMattingUserDB(List<User> mattingUserList)
    {
        userRepository.insertMattingUserList(mattingUserList);
    }


    @Override
    public List<User> PremiumRandomMatting(User user) {
        return null;
    }
}
