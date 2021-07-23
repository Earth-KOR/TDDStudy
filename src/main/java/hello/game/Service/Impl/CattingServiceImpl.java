package hello.game.Service.Impl;

import hello.game.Entity.User;
import hello.game.Enum.MemberShip;
import hello.game.Repository.UserRepository;
import hello.game.Service.CattingService;
import hello.game.Service.UserService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class CattingServiceImpl implements CattingService {

    private final UserService userService;
    private final UserRepository userRepository;

    public CattingServiceImpl(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }

    @Override
    public User randomMatting(User user) throws Exception {

        List<User> mattingUserList = new ArrayList<>();

        User responseUser = userService.findOneUser(MemberShip.NORMAR);

        mattingUserList.add(user);
        mattingUserList.add(responseUser);

        //CASE 1
        // userRepository.insertMattingUserList(mattingUserList)

        //CASE 2
        // insertMattingUserDB(mattingUserList);

        //CASE 3
        insertMattingUserDB(mattingUserList);

        return responseUser;
    }

    //CASE 2 && 3
    private Long insertMattingUserDB(List<User> mattingUserList)
    {
        return userRepository.insertMattingUserList(mattingUserList);
    }


    @Override
    public List<User> PremiumRandomMatting(User user) {

        // CASE 1
        List<User> mattingUserList = new ArrayList<>();

        List<User> listOfUser = userRepository.findMostLikedUser();

        listOfUser.sort(Comparator.comparing(User::getAmountOfLike).reversed());

//      // CASE 2
//      user.setAmountOfPurchase(userRepository.payPayment(user));
//
//      // CASE 3
//      user.setMemberShip(userRepository.updateMembership(user));
        updateUserInfo(user);

        mattingUserList.add(listOfUser.get(0));
        mattingUserList.add(user);

        return mattingUserList;
        
    }

    private void updateUserInfo(User user) {

        user.setAmountOfPurchase(userRepository.payPayment(user));

        user.setMemberShip(userRepository.updateMembership(user));
    }
}
