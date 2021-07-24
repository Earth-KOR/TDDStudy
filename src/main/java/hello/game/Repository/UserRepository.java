package hello.game.Repository;

import hello.game.DTO.ApplyUserDTO;
import hello.game.Entity.User;
import hello.game.Enum.MemberShip;

import java.util.List;

public interface UserRepository {

    void applyUser(ApplyUserDTO user);

    Long payPayment(User user);

    MemberShip updateMembership(User user);

    Long insertMattingUserList(List<User> userList);

    List<User> findMostLikedUser();

    User applyLikeToUser(User user, Boolean isLikeUser);

    String spyTest();

    Long countFeedback(User user);

}
