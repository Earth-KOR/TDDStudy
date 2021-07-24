package hello.game.Service.Impl;

import hello.game.Entity.User;
import hello.game.Repository.UserRepository;
import hello.game.Service.FeedBackService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FeedBackServiceImpl implements FeedBackService {

    private final UserRepository userRepository;

    @Override
    public Boolean applyBenToUser(Boolean isUserBen) {
        return null;
    }

    @Override
    public User applyLikeToUser(User user, Boolean isUserLike) {


        // CASE 2
//        if(userRepository.countFeedback(user) <= 0L) {
//            throw new IllegalStateException("오늘 하루 사용 가능한 피드백 수를 사용하였습니다.");
//        }


        //CASE 2 - 리펙토링
        Long stackOfFeedbackCount = userRepository.countFeedback(user);

        if(stackOfFeedbackCount <= 0L) {
            throw new IllegalStateException("오늘 하루 사용 가능한 피드백 수를 사용하였습니다.");
        }

        // CASE 1
        user.setName(userRepository.spyTest());
        User userTest = userRepository.applyLikeToUser(user, isUserLike);
        user.setAmountOfLike(userTest.getAmountOfLike());

        return user;
    }
}
