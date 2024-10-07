package OrderApp;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static OrderApp.Dish.*;

public class Customer {
    private String name;
    private int count;
    private int type; //  0 > 內用, 1 > 外帶
    private int totalPrice;

    // 點了什麼菜 儲存成集合
    private static ArrayList<Dish> customersOrder = new ArrayList<>();

    public Customer(String name, int count, int type, int totalPrice) {
        this.name = name;
        this.count = count;
        this.type = type;
        this.totalPrice = totalPrice;
    }

    public Customer() {
    }


    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    // 客戶資料建置 : 桌號外帶大名
    public static Customer customerInital() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("請問客戶大名？");
        String customerName = scanner.nextLine();

        Customer customer = new Customer();
        customer.setName(customerName);

        System.out.println("客戶名稱已設定為：" + customer.getName());
        System.out.println("您好 " + customer.getName() + " 先生/小姐，總共幾人來用餐?");

        int customerCount = Integer.parseInt(scanner.nextLine());
        customer.setCount(customerCount);
        System.out.println("好的 " + customer.getName() + " 先生/小姐，總共" + customer.getCount() + "人來用餐，請問內用 0 外帶 1？");

        int customerType = scanner.nextInt();
        customer.setType(customerType);
        System.out.println("Type 已設定為：" + customer.getType());

        // 創建 Random 物件
        Random r = new Random();

        // 生成 1 到 10 的隨機數
        int randomNumber = r.nextInt(10) + 1;

        if (customer.getType() == 0) {
            System.out.println("好的 " + customer.getName() + " 先生/小姐，您為內用，請去 " + randomNumber + " 號桌");
        } else {
            System.out.println("好的 " + customer.getName() + " 先生/小姐，您為外帶");
        }

        return customer;
    }

    // 客戶點餐集合
    public static ArrayList<Dish> customersOrderDishes() {

        System.out.println("請直接輸入欲添加的菜品號，點餐完成請點 0 回到主菜單");

        Scanner scanner = new Scanner(System.in);      // 創建 Scanner 來讀取用戶輸入

        while (true) {

            int secondCommand = scanner.nextInt();     // 每次迴圈都讀取新的輸入

            switch (secondCommand) {
                case 1:
                    customersOrder.add(FriedRice);
                    System.out.println("炒飯 點餐成功");

                    break;
                case 2:
                    customersOrder.add(RoastChicken);
                    System.out.println("烤雞 點餐成功");
                    break;
                case 3:
                    customersOrder.add(RoastDuck);
                    System.out.println("烤鴨 點餐成功");
                    break;
                case 4:
                    customersOrder.add(RoastBeef);
                    System.out.println("烤大牛排 點餐成功");
                    break;
                case 0:
                    System.out.println("回到主菜單");
                    return customersOrder;
                default:
                    System.out.println("無效的選擇，請重新輸入！");
                    break;
            }
        }
    }

    // 顯示客戶點餐集合列表
    public static String SHOWcustomersOrderDishes() {
        if (customersOrder == null || customersOrder.isEmpty()) {
            return "目前沒有已點項目。";
        }

        StringBuilder result = new StringBuilder("已點項目列表：\n");
        for (Dish dish : customersOrder) {
            result.append(String.format("菜品: %s, 價格: $%d\n", dish.getDishName(), dish.getDishPrice()));
        }
        return result.toString();
    }

    // 計算客戶點餐集合
    public static String MoneycustomersOrderDishes() {
        if (customersOrder == null || customersOrder.isEmpty()) {
            return "目前沒有已點項目。";
        }

        int totalPrice = 0;  // 用於累加總價
        for (Dish dish : customersOrder) {
            totalPrice += dish.getDishPrice();  // 累加每道菜的價格
        }

        return String.format("您點的菜品總價為：$%d", totalPrice);
    }

    // 客戶在點餐集合中進行刪除餐點
    public static ArrayList<Dish> DeletecustomersOrderDishes(int deletedish) {

        Scanner scanner = new Scanner(System.in);      // 創建 Scanner 來讀取用戶輸入

        if (deletedish == 0) {
            System.out.println("請直接輸入欲刪除的菜品號，刪除完成請點 0 回到主菜單");
            while (true) {

                int secondCommand = scanner.nextInt();     // 每次迴圈都讀取新的輸入

                switch (secondCommand) {
                    case 1:
                        customersOrder.remove(FriedRice);
                        System.out.println("炒飯 刪餐成功");

                        break;
                    case 2:
                        customersOrder.remove(RoastChicken);
                        System.out.println("烤雞 刪餐成功");
                        break;
                    case 3:
                        customersOrder.remove(RoastDuck);
                        System.out.println("烤鴨 刪餐成功");
                        break;
                    case 4:
                        customersOrder.remove(RoastBeef);
                        System.out.println("烤大牛排 刪餐成功");
                        break;
                    case 0:
                        System.out.println("回到主菜單");
                        return customersOrder;
                    default:
                        System.out.println("無效的選擇，請重新輸入！");
                        break;
                }
            }
        }
        return customersOrder;
    }
}



