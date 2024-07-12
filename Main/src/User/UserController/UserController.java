package User.UserController;

import User.UserModel.UserModel;
import User.UserService.UserService;

public class UserController {
    UserService userService = new UserService();
    int id = 1;

    public void signup(String username, String password, String nickname, String address){
        UserModel userModel = new UserModel(id, username, password, nickname, address);
        userService.register(id, userModel);
        id++;
    }

    public UserModel login(String username, String password) {
        return userService.login(username, password);
    }

    public boolean update(int id, String username, String password, String nickname, String address) {
        return userService.update(id, username, password, nickname, address);
    }

    public void delete(int id) {
        userService.delete(id);
    }
    // 이건 컨트롤러..
}