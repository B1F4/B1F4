package Menu.MenuView;

import Menu.MenuModel.MenuModel;
import java.util.List;
import java.util.Scanner;

public class MenuView {
    private Scanner scanner;

    public MenuView() {
        this.scanner = new Scanner(System.in);
    }

    public int getMenuChoice() {
        System.out.println("\n===== 메뉴 관리 시스템 =====");
        System.out.println("1. 새 메뉴 추가");
        System.out.println("2. 모든 메뉴 조회");
        System.out.println("3. 특정 메뉴 조회");
        System.out.println("4. 메뉴 업데이트");
        System.out.println("5. 메뉴 삭제");
        System.out.println("6. ID로 메뉴 조회"); // 새로운 옵션 추가
        System.out.println("7. 종료");
        System.out.print("원하는 작업을 선택하세요: ");
        return scanner.nextInt();
    }

    public MenuModel getMenuInput() {
        scanner.nextLine(); // 버퍼 비우기
        System.out.print("메뉴 이름: ");
        String name = scanner.nextLine();
        System.out.print("가격: ");
        int price = scanner.nextInt();
        System.out.print("매장 ID: ");
        int storeId = scanner.nextInt();
        return new MenuModel(0, storeId, name, price); // id는 0으로 설정 (새 메뉴)
    }

    public int getMenuIdInput() {
        System.out.print("메뉴 ID를 입력하세요: ");
        return scanner.nextInt();
    }

    public void displayMenu(MenuModel menu) {
        System.out.println("\n===== 메뉴 정보 =====");
        System.out.println("ID: " + menu.getId());
        System.out.println("이름: " + menu.getMenuName());
        System.out.println("가격: " + menu.getPrice());
        System.out.println("매장 ID: " + menu.getStoreId());
    }

    public void displayMenus(List<MenuModel> menus) {
        System.out.println("\n===== 모든 메뉴 =====");
        for (MenuModel menu : menus) {
            System.out.println(menu.getId() + ". " + menu.getMenuName() + " - 가격: " + menu.getPrice() + ", 매장 ID: " + menu.getStoreId());
        }
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public int getStoreIdInput() {
    System.out.print("가게 ID를 입력하세요: ");
    return scanner.nextInt();
    }

    public void displayMenusForStore(List<MenuModel> menus, int storeId) {
        System.out.println("\n===== 가게 ID " + storeId + "의 메뉴 =====");
        if (menus.isEmpty()) {
            System.out.println("해당 가게의 메뉴가 없습니다.");
        } else {
            for (MenuModel menu : menus) {
                System.out.println(menu.getId() + ". " + menu.getMenuName() + " - 가격: " + menu.getPrice());
            }
        }
    }
}