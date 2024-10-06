package OrderApp;


import static OrderApp.Customer.customerInital;
import static OrderApp.Dish.DishesInital;
import static OrderApp.Dish.generateMenu;
import static OrderApp.MadeMenu.ShowMainMenu;
import static OrderApp.MadeMenu.customerCommand;

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

        // 接收客戶指令
        int command = customerCommand();

        // 處理客戶指令
        switch (command) {
            case 1:
                System.out.println("顯示全店菜品...");
                System.out.println(generateMenu());
                break;
            case 2:
                System.out.println("顯示已點項目...");
                break;
            case 3:
                System.out.println("正在結帳...");
                break;
            default:
                System.out.println("無效的選項，請輸入1、2或3。");
                break;
        }
    }
}