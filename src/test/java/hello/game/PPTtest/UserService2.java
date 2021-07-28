package hello.game.PPTtest;

public class UserService2 {

    private final UserService userService;

    public UserService2(UserService userService) {
        this.userService = userService;
    }

    void test() {
       System.out.println(userService.test());

    }
}
