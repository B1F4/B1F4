package Menu.MenuModel;

public class MenuModel {
    private int id;
    private int storeId;
    private String menuName;
    private int price;

    // 모든 필드를 매개변수로 받는 생성자
    // id는 식별자이므로 static으로 써야 하나? Menu의 고유한 id 라 상관없나?
    public MenuModel(int id, int storeId, String menuName, int price) {
        this.id = id;
        this.storeId = storeId;
        this.menuName = menuName;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //로깅용
    @Override
    public String toString() {
        return "MenuModel{" +
                "id=" + id +
                ", storeId=" + storeId +
                ", menuName='" + menuName + '\'' +
                ", price=" + price +
                '}';
    }
}
