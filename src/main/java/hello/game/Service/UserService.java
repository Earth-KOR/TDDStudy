package hello.game.Service;


import hello.game.DTO.ApplyUserDTO;
import hello.game.Entity.User;
import hello.game.Enum.MemberShip;

public interface UserService {

    User applyUser(ApplyUserDTO user);

    Long payPayment(User user);

    MemberShip updateMembership(User user);

    User findOneUser(MemberShip membership);

}
