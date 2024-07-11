package User;

import User.UserController.UserController;
import User.UserModel.UserModel;

import java.util.Scanner;

public class UserView {
    public static void main(String[] args) {
        UserController userController =new UserController();
        Scanner sc = new Scanner(System.in);
        UserModel loggedInUser = new UserModel("지혀", "jinhyeok", "123", "기흥역");
        while (true) {
            System.out.println("환영합니다. 번호를 입력해주세요");
            if (loggedInUser == null) {
                System.out.println("1. 회원가입 / 2. 로그인");
            } else {
                System.out.println("1. 주문하기 / 2. 로그아웃 / 3. 회원 정보 수정 / 4. 회원 탈퇴");
            }
            int choice = sc.nextInt();

            if (choice == 1) {
                if (loggedInUser == null) {
                    System.out.println("아이디를 입력해주세요.");
                    String username = sc.next();
                    System.out.println("비밀번호를 입력해주세요.");
                    String password = sc.next();
                    System.out.println("닉네임을 입력해주세요.");
                    String nickname = sc.next();
                    System.out.println("주소를 입력해주세요.");
                    String address = sc.next();
                    userController.signup(username, password, nickname, address);
                    break;
                } else {
                    System.out.println("주문하기");
                    break;
                }
            } else if (choice == 2) {
                if (loggedInUser == null) {
                    System.out.println("아이디를 입력해주세요.");
                    String username = sc.next();
                    System.out.println("비밀번호를 입력해주세요.");
                    String password = sc.next();
                    break;
                } else {
                    System.out.println("로그아웃");
                    break;
                }
            } else if (choice == 3) {
                if (loggedInUser != null) {
                    System.out.println("회원 정보 수정");
                    break;
                } else {
                    System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
                }
            } else if (choice == 4) {
                if (loggedInUser != null) {
                    System.out.println("회원 탈퇴");
                    break;
                } else {
                    System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
                }
            } else {
                System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
            }
        }

    }
}
