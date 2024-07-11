package User.UserService;

import User.UserModel.UserModel;
import User.UserRepository.UserRepository;

public class UserService {
    // 로직 처리
    int id = 1;
    UserRepository userRepository = new UserRepository();

    public void register(UserModel userModel){
        userRepository.save(id, userModel);
        id++;
    }
}
