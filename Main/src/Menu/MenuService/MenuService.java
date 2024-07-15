package Menu.MenuService;

import Menu.MenuModel.MenuModel;

import java.util.ArrayList;
import java.util.List;

public interface MenuService {
    MenuModel createMenu(MenuModel menu);
    List<MenuModel> getAllMenus();
    MenuModel getMenuById(int id);
    MenuModel updateMenu(MenuModel menu);
    boolean deleteMenu(int id);
    List<MenuModel> getMenusByStoreId(int storeId);
    ArrayList<String> changetypemethod(List<MenuModel> menus);
}