package OrderApp;


import static OrderApp.Customer.customerInital;
import static OrderApp.Dish.DishesInital;
import static OrderApp.MadeMenu.ShowMainMenu;

/*
    詢問客戶資訊
    顯示菜單頁面
    1. 全店菜品顯示
    2. 已點項目 - 含二級命令可以刪除菜品
    3. 結帳 - 顯示客戶點菜總額
 */

public class Menu {

    public static void main(String[] args) {

        DishesInital();
        customerInital();
        ShowMainMenu();

    }
}