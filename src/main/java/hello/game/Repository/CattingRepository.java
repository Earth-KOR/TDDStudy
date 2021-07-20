package hello.game.Repository;

import hello.game.Entity.User;

import java.util.List;

public interface CattingRepository {

    List<User> randomMatting(User user);

    List<User> PremiumRandomMatting(User user);


}
