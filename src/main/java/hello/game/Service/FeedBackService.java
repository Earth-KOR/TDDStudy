package hello.game.Service;

import hello.game.Entity.User;

public interface FeedBackService {

    Boolean applyBenToUser(Boolean isUserBen);

    User applyLikeToUser(User user, Boolean isUserLike);

}
