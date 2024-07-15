package Menu.MenuService;

import Menu.MenuModel.MenuModel;
import Menu.MenuRepository.MenuRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MenuServiceImpl implements MenuService {
    private final MenuRepository menuRepository;

    public MenuServiceImpl(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    @Override
    public MenuModel createMenu(MenuModel menu) {
        return menuRepository.save(menu);
    }

    @Override
    public List<MenuModel> getAllMenus() {
        return menuRepository.findAll();
    }

    @Override
    public MenuModel getMenuById(int id) {
        Optional<MenuModel> menuOptional = menuRepository.findById(id);
        return menuOptional.orElse(null);
    }

    @Override
    public MenuModel updateMenu(MenuModel menu) {
        if (menuRepository.existsById(menu.getId())) {
            return menuRepository.save(menu);
        }
        return null;
    }

    @Override
    public boolean deleteMenu(int id) {
        if (menuRepository.existsById(id)) {
            menuRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public List<MenuModel> getMenusByStoreId(int storeId) {
        return menuRepository.findByStoreId(storeId);
    }

    @Override
    public ArrayList<String> changetypemethod(List<MenuModel> menus){
        ArrayList<String> newchangemenus= new ArrayList<>();
        for (MenuModel menu:menus){
            newchangemenus.add(menu.getMenuName());
        }
        return newchangemenus;
    }
}
