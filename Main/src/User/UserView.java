package User;

import Restaurant.RestaurantView;
import User.UserController.UserController;
import User.UserModel.UserModel;

import java.util.Scanner;

public class UserView {

    private static final String START_MESSAGE = "        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠈⠙⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡸⢤⣡⣴⣶⣾⣿⣿⣷⣾⣥⡃⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⡙⠚⠀⠀⠀⠀⢀⣀⡀⠀⣰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⣠⣴⣶⣶⣶⣦⠀⠀\n" +
            "⠀⠀⠀⠠⣌⡁⠀⠀⢠⣾⣿⣿⣿⣷⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀\n" +
            "⠀⠀⠀⢐⡂⠀⠀⠀⠸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠃⠀⠀\n" +
            "⠀⠀⠠⢄⠈⠉⠀⠀⠀⠀⠉⠛⠋⢡⣿⡿⠛⠻⣿⣿⣿⡟⠛⠻⣿⣿⣿⡷⣄⠀⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠐⠒⠒⠀⠀⠀⠀⣀⣤⡖⠭⢹⣿⠁⠰⢂⣿⣿⣿⠀⠟⠀⣼⣿⣿⠒⠤⣉⢒⣤⡀⠀⠀\n" +
            "⠀⠀⠠⠦⠀⠀⢀⣴⣿⣿⣿⡟⠊⣿⣿⣦⣴⣿⣿⣿⣿⣷⣶⣾⣿⣿⣿⣶⣶⣾⣿⣿⣿⣦⠀\n" +
            "⠀⠀⠉⣀⠀⢰⣿⣿⣿⣿⣿⠀⢠⡿⠛⠛⠛⠛⠻⠿⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⠀\n" +
            "⠀⠀⢐⠦⡀⠀⠻⣿⣿⣿⣿⣶⡞⠁⠀⣴⠀⠀⠀⣰⠂⠀⠙⣿⣿⣿⣿⣿⣿⡿⠋⠀⠀⠀\n" +
            "⠀⠀⠔⣪⠕⠀⠀⠙⣿⣿⣿⣿⣄⡀⠀⠀⠀⠀⠀⠈⠀⠀⠀⣹⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠈⢀⢔⠅⠀⠀⠘⣿⣿⣿⣿⣿⣿⣶⣶⣦⣤⣤⣤⣶⣾⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠁⣡⢖⠄⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠁⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠡⠃⠂⠀⠀⠀⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠛⠃⠀⠀⠀⠀⠀⠀⠀";
    private static final String LOGIN_PROMPT = "|￣￣￣￣￣￣￣￣￣￣￣￣￣￣|\n" +
            "|    아이디를 입력하세요   |\n" +
            "|＿＿＿＿＿＿＿＿＿＿＿＿＿＿|\n" +
            "       \\ (•◡•) /\n" +
            "        \\      /\n";
    private static final String PASSWORD_PROMPT = "|￣￣￣￣￣￣￣￣￣￣￣￣￣￣|\n" +
            "|  비밀번호를 입력하세요   |\n" +
            "|＿＿＿＿＿＿＿＿＿＿＿＿＿＿|\n" +
            "       \\ (•◡•) /\n" +
            "        \\      /\n";
    private static final String WELCOME_USER = "\n" +
            " _    _  _____  _      _____  _____ ___  ___ _____ \n" +
            "| |  | ||  ___|| |    /  __ \\|  _  ||  \\/  ||  ___|\n" +
            "| |  | || |__  | |    | /  \\/| | | || .  . || |__  \n" +
            "| |/\\| ||  __| | |    | |    | | | || |\\/| ||  __| \n" +
            "\\  /\\  /| |___ | |____| \\__/\\\\ \\_/ /| |  | || |___ \n" +
            " \\/  \\/ \\____/ \\_____/ \\____/ \\___/ \\_|  |_/\\____/ \n";

    private UserController userController;
    private Scanner sc;
    private UserModel loggedInUser;

    public UserView() {
        userController = new UserController();
        sc = new Scanner(System.in);
        loggedInUser = null;
        System.out.println(START_MESSAGE);
        run();
    }

    public void run() {
        while (true) {
            displayMenu(loggedInUser);
            int choice = sc.nextInt();

            if (choice == 1) {
                if (loggedInUser == null) {
                    handleSignup(userController, sc);
                } else {
                    handleOrder();
                }
            } else if (choice == 2) {
                if (loggedInUser == null) {
                    loggedInUser = handleLogin(userController, sc);
                } else {
                    loggedInUser = handleLogout(sc);
                }
            } else if (choice == 3) {
                if (loggedInUser != null) {
                    handleUpdate(userController, sc, loggedInUser);
                } else {
                    System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
                }
            } else if (choice == 4) {
                if (loggedInUser != null) {
                    loggedInUser = handleDelete(userController, sc, loggedInUser);
                } else {
                    System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
                }
            } else {
                System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
            }
        }
    }

    private static void displayMenu(UserModel loggedInUser) {
        System.out.println("번호를 입력해주세요");
        if (loggedInUser == null) {
            System.out.println("1. 회원가입 / 2. 로그인");
        } else {
            System.out.println("1. 주문하기 / 2. 로그아웃 / 3. 회원 정보 수정 / 4. 회원 탈퇴");
        }
    }

    private static void handleSignup(UserController userController, Scanner sc) {
        System.out.println("아이디를 입력해주세요.");
        String username = sc.next();
        System.out.println("비밀번호를 입력해주세요.");
        String password = sc.next();
        System.out.println("닉네임을 입력해주세요.");
        String nickname = sc.next();
        System.out.println("주소를 입력해주세요.");
        String address = sc.next();
        userController.signup(username, password, nickname, address);
    }

    private static void handleOrder() {
        new RestaurantView();
    }

    private static UserModel handleLogin(UserController userController, Scanner sc) {
        System.out.println(LOGIN_PROMPT);
        String username = sc.next();
        System.out.println(PASSWORD_PROMPT);
        String password = sc.next();
        UserModel loggedInUser = userController.login(username, password);
        if (loggedInUser != null) {
            System.out.println(WELCOME_USER);
            System.out.println("환영합니다." + loggedInUser.getNickname() + "님");
        } else {
            System.out.println("로그인 실패");
        }
        return loggedInUser;
    }

    private static UserModel handleLogout(Scanner sc) {
        System.out.println("로그아웃 하시겠습니까? (y/n)");
        String logout = sc.next();
        if (logout.equalsIgnoreCase("y")) {
            return null;
        } else if (!logout.equalsIgnoreCase("n")) {
            System.out.println("잘못 입력 하셨습니다.");
        }
        return null;
    }

    private static void handleUpdate(UserController userController, Scanner sc, UserModel loggedInUser) {
        System.out.println("아이디를 입력해주세요.");
        String username = sc.next();
        System.out.println("비밀번호를 입력해주세요.");
        String password = sc.next();
        System.out.println("닉네임을 입력해주세요.");
        String nickname = sc.next();
        System.out.println("주소를 입력해주세요.");
        String address = sc.next();
        boolean upd = userController.update(loggedInUser.getId(), username, password, nickname, address);
        if (upd) {
            System.out.println("수정이 완료되었습니다.");
        } else {
            System.out.println("수정이 실패하였습니다.");
        }
    }

    private static UserModel handleDelete(UserController userController, Scanner sc, UserModel loggedInUser) {
        System.out.println("회원 탈퇴를 하시겠습니까? (y/n)");
        String choose = sc.next();
        if (choose.equalsIgnoreCase("y")) {
            System.out.println("10000원 쿠폰 드릴게요.... 진짜 탈퇴하실건가요?? (y/n)");
            choose = sc.next();
            if (choose.equalsIgnoreCase("y")) {
                userController.delete(loggedInUser.getId());
                System.out.println("꺼지쇼.");
                return null;
            }
        }
        return loggedInUser;
    }

    public static void main(String[] args) {
        new UserView();
    }
}
