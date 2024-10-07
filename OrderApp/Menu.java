package OrderApp;


import java.util.ArrayList;

import static OrderApp.Customer.*;
import static OrderApp.Customer.MoneycustomersOrderDishes;
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

        int checkout = 1;
        int deletedish = 1;
        DishesInital();
        customerInital();

        // switch break 出後會進入下一個 模塊，初始化就一次

        while (true) {

            // System.out.println(deletedish +"break 後 deletedish 多少");
            // System.out.println(checkout+"break 後 checkout多少");

            if (checkout == 1 | deletedish == 1) {
                ShowMainMenu(); 
            }else{
                System.out.println("謝謝惠顧，再見");
            return;
            }
            
            // 接收客戶指令
            int command = customerCommand();

            // 處理客戶指令
            switch (command) {
                case 1:
                    System.out.println("顯示全店菜品...");
                    System.out.println(generateMenu());
                    customersOrderDishes();
                    break;

                case 2:
                    System.out.println("顯示已點項目...");
                    System.out.println(SHOWcustomersOrderDishes());
                    System.out.println("請問是否要修改菜單 0 是， 1 否");
                    deletedish = customerCommand();
                    DeletecustomersOrderDishes(deletedish);

                    //System.out.println(deletedish +"break 前 deletedish 多少");
                    break;

                case 3:
                    System.out.println("正在結帳...");
                    System.out.println(MoneycustomersOrderDishes());
                    System.out.println("請問是否要結帳 0 是， 1 否");
                    checkout = customerCommand();
                    deletedish = 3; //不清空會在判斷 ||  那邊出錯

                    //System.out.println(checkout+"break 前 checkout多少");

                    break;

                default:
                    System.out.println("無效的選項，請輸入1、2或3。");
                    break;
            }
        }
    }
}