package Menu.MenuRepository;

import Menu.MenuModel.MenuModel;
import java.util.List;
import java.util.Optional;

public interface MenuRepository {
    MenuModel save(MenuModel menu);
    Optional<MenuModel> findById(int id);
    List<MenuModel> findAll();
    void deleteById(int id);
    boolean existsById(int id);
}


