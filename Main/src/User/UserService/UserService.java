package User.UserService;

import User.UserModel.UserModel;
import User.UserRepository.UserRepository;

public class UserService {
    // 로직 처리
    UserRepository userRepository = new UserRepository();

    public void register(int id, UserModel userModel){
        userRepository.save(id, userModel);
    }


    public UserModel login(String username, String password) {
        UserModel user = userRepository.findUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    public boolean update(int id, String username, String password, String nickname, String address) {
        UserModel user = userRepository.findId(id);
        if (user != null) {
            user.setUsername(username);;
            user.setPassword(password);
            user.setNickname(nickname);
            user.setAddress(address);
            userRepository.save(id, user);
            return true;
        }
        return false;
    }


    public void delete(int id) {
        userRepository.delete(id);
    }

}
