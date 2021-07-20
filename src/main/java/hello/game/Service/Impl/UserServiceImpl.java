package hello.game.Service.Impl;

import hello.game.DTO.ApplyUserDTO;
import hello.game.Entity.User;
import hello.game.Enum.MemberShip;
import hello.game.Service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User applyUser(ApplyUserDTO user) {
        return null;
    }

    @Override
    public Long payPayment(User user) {
        return null;
    }

    @Override
    public User findOneUser(MemberShip membership) {
        return null;
    }

    @Override
    public MemberShip updateMembership(User user) {
        return null;


    }
}
