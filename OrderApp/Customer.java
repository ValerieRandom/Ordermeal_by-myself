package OrderApp;

import java.util.ArrayList;

public class Customer {


    private String Name;
    private int Count;
    private int Type; //  0 > 內用  1 > 外帶
    private int DeskNumber;
    private int TotalPrice;

    // 點了什麼菜 儲存成集合 要記得儲存的就是 Dish 類別
    private static ArrayList<Dish> dishList = new ArrayList<>();


    public Customer(String name, int count, int deskNumber, int type, int totalPrice) {
        Name = name;
        Count = count;
        DeskNumber = deskNumber;
        Type = type;
        TotalPrice = totalPrice;
    }


    public int getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        TotalPrice = totalPrice;
    }


    public int getType() {
        return Type;
    }

    public void setType(int type) {
        Type = type;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }

    public int getDeskNumber() {
        return DeskNumber;
    }

    public void setDeskNumber(int deskNumber) {
        DeskNumber = deskNumber;
    }

    public static ArrayList<Dish> getDishList() {
        return dishList;
    }

    public static void setDishList(ArrayList<Dish> dishList) {
        Customer.dishList = dishList;
    }


}
