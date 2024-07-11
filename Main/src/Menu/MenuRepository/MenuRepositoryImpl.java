package Menu.MenuRepository;

import Menu.MenuModel.MenuModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

//클린코드 측면에서 이름이 이게 맞는가?
//Implements를 굳이 언급해야할까?
public class MenuRepositoryImpl implements MenuRepository {
    private Map<Integer,MenuModel> menuStore = new HashMap<>();
    private int nextId = 1;

     @Override
    public MenuModel save(MenuModel menu) {
        if (menu.getId() == 0) {
            // 새로운 메뉴 추가
            menu = new MenuModel(nextId++, menu.getStoreId(), menu.getMenuName(), menu.getPrice());
        }
        menuStore.put(menu.getId(), menu);
        return menu;
    }

    @Override
    public Optional<MenuModel> findById(int id) {
        return Optional.ofNullable(menuStore.get(id));
    }

    @Override
    public List<MenuModel> findAll() {
        return new ArrayList<>(menuStore.values());
    }

    @Override
    public void deleteById(int id) {
        menuStore.remove(id);
    }

    @Override
    public boolean existsById(int id) {
        return menuStore.containsKey(id);
    }
}
