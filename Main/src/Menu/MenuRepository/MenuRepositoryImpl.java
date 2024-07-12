package Menu.MenuRepository;

import Menu.MenuModel.MenuModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

//클린코드 측면에서 이름이 이게 맞는가?
//Implements를 굳이 언급해야할까?
public class MenuRepositoryImpl implements MenuRepository {
    private Map<Integer,MenuModel> menuStore = new HashMap<>();
    private int nextId = 1;

    public MenuRepositoryImpl() {
        save(new MenuModel(nextId++, 1, "짜장면", 8000));
        save(new MenuModel(nextId++, 1, "짬뽕", 9000));
        save(new MenuModel(nextId++, 1, "탕수육", 15000));

        save(new MenuModel(nextId++,2,"피자",15000));
        save(new MenuModel(nextId++, 2, "파스타", 9000));
        save(new MenuModel(nextId++, 2, "샐러드", 6000));

        save(new MenuModel(nextId++, 3, "떡볶이", 7000));
        save(new MenuModel(nextId++, 3, "마라떡볶이", 17000));
        save(new MenuModel(nextId++, 3, "로제떡볶이", 18000));

        save(new MenuModel(nextId++, 4, "자금성 짜장", 10000));
        save(new MenuModel(nextId++, 4, "자금성 짬뽕", 15000));
        save(new MenuModel(nextId++, 4, "자금성 탕수육", 20000));

    }




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

    @Override
    public List<MenuModel> findByStoreId(int storeId) {
        return menuStore.values().stream()
                .filter(menu -> menu.getStoreId() == storeId)
                .collect(Collectors.toList());
    }


}
