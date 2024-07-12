package User.UserModel;

public class UserModel {

    // 실습때 USER
    private int id;
    private String nickname; // nickname
    private String username; // id
    private String password;
    private String address;

    public UserModel(int id, String username, String password, String nickname, String address) {
        this.id = id;
        this.nickname = nickname;
        this.username = username;
        this.password = password;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
