package hello.game.Service;

import hello.game.Entity.User;

import java.util.List;

public interface CattingService {

    User randomMatting(User user) throws Exception;

    List<User> PremiumRandomMatting(User user);
}
