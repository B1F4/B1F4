package Menu.MenuController;

import Menu.MenuModel.MenuModel;
import Menu.MenuService.MenuService;

import Menu.MenuView;
import Order.OrderView;

import java.util.ArrayList;
import java.util.List;

public class MenuController {
    private MenuService menuService;
    private MenuView menuView;

    public MenuController(MenuService menuService, MenuView menuView) {
        this.menuService = menuService;
        this.menuView = menuView;
    }

    public void createMenu() {
        MenuModel newMenu = menuView.getMenuInput();
        MenuModel createdMenu = menuService.createMenu(newMenu);
        menuView.displayMessage("메뉴가 생성되었습니다: " + createdMenu.getMenuName());
    }

    public void getAllMenus() {
        List<MenuModel> menus = menuService.getAllMenus();
        menuView.displayMenus(menus);
    }

     public void getMenuById() {
        int id = menuView.getMenuIdInput();
        MenuModel menu = menuService.getMenuById(id);
        if (menu != null) {
            menuView.displayMenu(menu);
        } else {
            menuView.displayMessage("메뉴를 찾을 수 없습니다.");
        }
    }
    public void updateMenu() {
        int id = menuView.getMenuIdInput();
        MenuModel existingMenu = menuService.getMenuById(id);
        if (existingMenu != null) {
            MenuModel updatedMenu = menuView.getMenuInput();
            updatedMenu.setId(id);
            menuService.updateMenu(updatedMenu);
            menuView.displayMessage("메뉴가 업데이트되었습니다.");
        } else {
            menuView.displayMessage("업데이트할 메뉴를 찾을 수 없습니다.");
        }
    }
    public void deleteMenu() {
        int id = menuView.getMenuIdInput();
        boolean deleted = menuService.deleteMenu(id);
        if (deleted) {
            menuView.displayMessage("메뉴가 삭제되었습니다.");
        } else {
            menuView.displayMessage("삭제할 메뉴를 찾을 수 없습니다.");
        }
    }

    public ArrayList<String> getMenusByStoreId() {
        int storeId = menuView.getStoreIdInput();
        List<MenuModel> menus = menuService.getMenusByStoreId(storeId);
        menuView.displayMenusForStore(menus, storeId);
        ArrayList<String> finalmenu=menuService.changetypemethod(menus);
        return finalmenu;

    }

     public void processUserChoice(int choice) {
        switch (choice) {
            case 1:
                createMenu();
                break;
            case 2:
                getAllMenus();
                break;
            case 3:
                getMenuById();
                break;
            case 4:
                updateMenu();
                break;
            case 5:
                deleteMenu();
                break;
            case 6:
                ArrayList<String> finalmenus=getMenusByStoreId();
                new OrderView(finalmenus);
                break;
                case 7:
                menuView.displayMessage("프로그램을 종료합니다.");
                System.exit(0);
            default:
                menuView.displayMessage("잘못된 선택입니다. 다시 선택해주세요.");
        }
    }
    public void run() {
        while (true) {
            int choice = menuView.getMenuChoice();
            processUserChoice(choice);
        }
    }
}