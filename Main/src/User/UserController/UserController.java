package User.UserController;

import User.UserModel.UserModel;
import User.UserService.UserService;

public class UserController {
    UserService userService = new UserService();

    public void signup(String username, String password, String nickname, String address){
        UserModel userModel = new UserModel(username, password, nickname, address);
        userService.register(userModel);
    }
    // 이건 컨트롤러..
}
