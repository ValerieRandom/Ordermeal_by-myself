package OrderApp;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Customer {
    private String name;
    private int count;
    private int type; //  0 > 內用, 1 > 外帶
    private int deskNumber;
    private int totalPrice;

    // 點了什麼菜 儲存成集合
    private ArrayList<Dish> dishList = new ArrayList<>();

    public Customer(String name, int count, int deskNumber, int type, int totalPrice) {
        this.name = name;
        this.count = count;
        this.deskNumber = deskNumber;
        this.type = type;
        this.totalPrice = totalPrice;
    }

    public Customer() {
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
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

    public int getDeskNumber() {
        return deskNumber;
    }

    public void setDeskNumber(int deskNumber) {
        this.deskNumber = deskNumber;
    }

    public ArrayList<Dish> getDishList() {
        return dishList;
    }

    public void setDishList(ArrayList<Dish> dishList) {
        this.dishList = dishList;
    }

    // 客戶資料建置
    public static Customer customerInital() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("請問客戶大名？");
        String customerName = scanner.nextLine();
        Customer customer = new Customer();
        customer.setName(customerName);

        System.out.println("客戶名稱已設定為：" + customer.getName());

        System.out.println("您好 " + customer.getName() + " 先生/小姐，請問內用 0 外帶 1？");
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
}
