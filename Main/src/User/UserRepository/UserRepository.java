package User.UserRepository;
import User.UserModel.UserModel;
import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    // 해시맵 DAO
    private Map<Integer, UserModel> userMap = new HashMap<>();

    public void save(int id, UserModel userModel){
        userMap.put(id, userModel);
    }

    public UserModel findUsername(String username) {
        for (UserModel user : userMap.values()) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public UserModel findId(int id) {
        for (int key: userMap.keySet()){
            UserModel userModel = userMap.get(key);
            if ( key==id ){
                return userModel;
            }
        }
        return null;
    }

    public void delete(int id) {
        userMap.remove(id);
    }
}
