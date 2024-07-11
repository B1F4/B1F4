package User.UserModel;

public class UserModel {

    // 실습때 USER
    private String nickname; // nickname
    private String username; // id
    private String password;
    private String address;

    public UserModel(String nickname, String username, String password, String address) {
        this.nickname = nickname;
        this.username = username;
        this.password = password;
        this.address = address;
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
