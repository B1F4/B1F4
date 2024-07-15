package Menu;

import Menu.MenuController.MenuController;
import Menu.MenuRepository.MenuRepository;
import Menu.MenuRepository.MenuRepositoryImpl;
import Menu.MenuService.MenuService;
import Menu.MenuService.MenuServiceImpl;

public class MenuApplication {


    public MenuApplication() {
        // 1. Repository 생성
        MenuRepository menuRepository = new MenuRepositoryImpl();

        // 2. Service 생성
        MenuService menuService = new MenuServiceImpl(menuRepository);

        // 3. View 생성
        MenuView menuView = new MenuView();

        // 4. Controller 생성
        MenuController menuController = new MenuController(menuService, menuView);

        // 5. 애플리케이션 실행
        System.out.println("메뉴 관리 시스템을 시작합니다.");

        menuController.run();
    }
}