package hello.game.Repository.Impl;

import hello.game.DTO.ApplyUserDTO;
import hello.game.Entity.User;
import hello.game.Enum.MemberShip;
import hello.game.Repository.UserRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Override
    public void applyUser(ApplyUserDTO user) {

    }

    @Override
    public Long payPayment(User user) {
        return null;
    }

    @Override
    public MemberShip updateMembership(User user) {
        return null;
    }

    @Override
    public Long insertMattingUserList(List<User> userList) {
        System.out.println("호츌");
        return 33L;
    }

    @Override
    public List<User> findMostLikedUser() {
        return null;
    }
}
