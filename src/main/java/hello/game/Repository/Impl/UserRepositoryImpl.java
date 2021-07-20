package hello.game.Repository.Impl;

import hello.game.DTO.ApplyUserDTO;
import hello.game.Entity.User;
import hello.game.Repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Override
    public void applyUser(ApplyUserDTO user) {

    }

    @Override
    public void payPayment(User user) {

    }

    @Override
    public void updateMembership(User user) {

    }

    @Override
    public Long insertMattingUserList(List<User> userList) {
        return null;
    }
}
