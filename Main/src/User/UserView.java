package User;

import User.UserController.UserController;
import User.UserModel.UserModel;

import java.util.Scanner;

public class UserView {
    public static void main(String[] args) {
        UserController userController =new UserController();
        Scanner sc = new Scanner(System.in);
        UserModel loggedInUser = null;
        System.out.println(
                "        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠈⠙⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡸⢤⣡⣴⣶⣾⣿⣿⣷⣾⣥⡃⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⡙⠚⠀⠀⠀⠀⢀⣀⡀⠀⣰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⣠⣴⣶⣶⣶⣦⠀⠀\n" +
                "⠀⠀⠀⠠⣌⡁⠀⠀⢠⣾⣿⣿⣿⣷⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀\n" +
                "⠀⠀⠀⢐⡂⠀⠀⠀⠸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠃⠀⠀\n" +
                "⠀⠀⠠⢄⠈⠉⠀⠀⠀⠀⠉⠛⠋⢡⣿⡿⠛⠻⣿⣿⣿⡟⠛⠻⣿⣿⣿⡷⣄⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠐⠒⠒⠀⠀⠀⠀⣀⣤⡖⠭⢹⣿⠁⠰⢂⣿⣿⣿⠀⠟⠀⣼⣿⣿⠒⠤⣉⢒⣤⡀⠀⠀\n" +
                "⠀⠀⠠⠦⠀⠀⢀⣴⣿⣿⣿⡟⠊⣿⣿⣦⣴⣿⣿⣿⣿⣷⣶⣾⣿⣿⣿⣶⣶⣾⣿⣿⣿⣦⠀\n" +
                "⠀⠀⠉⣀⠀⢰⣿⣿⣿⣿⣿⠀⢠⡿⠛⠛⠛⠛⠻⠿⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⠀\n" +
                "⠀⠀⢐⠦⡀⠀⠻⣿⣿⣿⣿⣶⡞⠁⠀⣴⠀⠀⠀⣰⠂⠀⠙⣿⣿⣿⣿⣿⣿⣿⡿⠋⠀⠀⠀\n" +
                "⠀⠀⠔⣪⠕⠀⠀⠙⣿⣿⣿⣿⣄⡀⠀⠀⠀⠀⠀⠈⠀⠀⠀⣹⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠈⢀⢔⠅⠀⠀⠘⣿⣿⣿⣿⣿⣿⣶⣶⣦⣤⣤⣤⣶⣾⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠁⣡⢖⠄⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠁⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠡⠃⠂⠀⠀⠀⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠛⠃⠀⠀⠀⠀⠀⠀⠀");
        while (true) {
            System.out.println("번호를 입력해주세요");
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
                } else {
                    System.out.println("주문하기");
                }
            } else if (choice == 2) {
                if (loggedInUser == null) {
                    System.out.println(
                            "|￣￣￣￣￣￣￣￣￣￣￣￣￣￣|\n" +
                            "|    아이디를 입력하세요   |\n" +
                            "|＿＿＿＿＿＿＿＿＿＿＿＿＿＿|\n" +
                            "       \\ (•◡•) /\n" +
                            "        \\      /\n");
                    String username = sc.next();
                    System.out.println(
                            
                                    "|￣￣￣￣￣￣￣￣￣￣￣￣￣￣|\n" +
                                    "|  비밀번호를 입력하세요   |\n" +
                                    "|＿＿＿＿＿＿＿＿＿＿＿＿＿＿|\n" +
                                    "       \\ (•◡•) /\n" +
                                    "        \\      /\n");
                    String password = sc.next();
                    loggedInUser = userController.login(username, password);
                    if (loggedInUser != null) {
                        System.out.println("\n" +
                                " _    _  _____  _      _____  _____ ___  ___ _____ \n" +
                                "| |  | ||  ___|| |    /  __ \\|  _  ||  \\/  ||  ___|\n" +
                                "| |  | || |__  | |    | /  \\/| | | || .  . || |__  \n" +
                                "| |/\\| ||  __| | |    | |    | | | || |\\/| ||  __| \n" +
                                "\\  /\\  /| |___ | |____| \\__/\\\\ \\_/ /| |  | || |___ \n" +
                                " \\/  \\/ \\____/ \\_____/ \\____/ \\___/ \\_|  |_/\\____/ \n");
                        System.out.println("환영합니다." + loggedInUser.getNickname() + "님");
                    } else {
                        System.out.println("로그인 실패");
                    }
                } else {
                    System.out.println("로그아웃 하시겠습니까? (y/n)");
                    String logout = sc.next();
                    if(logout.equalsIgnoreCase("y")){
                        loggedInUser = null;
                    }
                    else if(logout.equalsIgnoreCase("n")){
                        continue;
                    }
                    else{
                        System.out.println("잘못 입력 하셨습니다.");
                    }
                }
            } else if (choice == 3) {
                if (loggedInUser != null) {
                    System.out.println("아이디를 입력해주세요.");
                    String username = sc.next();
                    System.out.println("비밀번호를 입력해주세요.");
                    String password = sc.next();
                    System.out.println("닉네임을 입력해주세요.");
                    String nickname = sc.next();
                    System.out.println("주소를 입력해주세요.");
                    String address = sc.next();
                    boolean upd = userController.update(loggedInUser.getId(), username, password, nickname, address);
                    if(upd) {
                        System.out.println("수정이 완료되었습니다.");
                    } else{
                        System.out.println("수정이 실패하였습니다.");
                    }
                } else {
                    System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
                }
            } else if (choice == 4) {
                if (loggedInUser != null) {
                    System.out.println("회원 탈퇴를 하시겠습니까? (y/n)");
                    String choose = sc.next();
                    if(choose.equalsIgnoreCase("y")){
                        System.out.println("10000원 쿠폰 드릴게요.... 진짜 탈퇴하실건가요?? (y/n)");
                        choose = sc.next();
                        if(choose.equalsIgnoreCase("y")){
                            userController.delete(loggedInUser.getId());
                            loggedInUser = null;
                            System.out.println("꺼지쇼.");
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }

                } else {
                    System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
                }
            } else {
                System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
            }
        }

    }
}
