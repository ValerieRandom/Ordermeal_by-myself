package OrderApp;

import java.util.ArrayList;

public class Customer {

    private String Name;
    private int Count;
    private int Type; //  0 > 內用  1 > 外帶
    private int DeskNumber;

    // 點了什麼菜 儲存成集合 要記得儲存的就是 Dish 類別
    private static ArrayList<Dish> dishList = new ArrayList<>();

    public Customer(String name, int count, int type, int deskNumber) {
        Name = name;
        Count = count;
        Type = type;
        DeskNumber = deskNumber;
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
