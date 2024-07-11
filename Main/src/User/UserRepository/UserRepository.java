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
}
