package OrderApp;

public class Dish {

    private String DishName;
    private int DishNumber;
    private int DishPrice;

    public Dish(String dishName, int dishNumber, int dishPrice) {
        this.DishName = dishName;
        this.DishNumber = dishPrice;
        this.DishPrice = dishNumber;
    }

    public Dish() {

    }

    public int getDishNumber() {
        return DishNumber;
    }

    public void setDishNumber(int dishNumber) {
        DishNumber = dishNumber;
    }

    public String getDishName() {
        return DishName;
    }

    public void setDishName(String dishName) {
        DishName = dishName;
    }

    public int getDishPrice() {
        return DishPrice;
    }

    public void setDishPrice(int dishPrice) {
        DishPrice = dishPrice;
    }


    // 建構菜品 注意這裡是方法類 所以不能直接執行代碼 以下就是直接執行代碼的範疇 我們需要包裝到靜態方法中才可以消除紅字
    public static String DishesInital(){

        // 第一種建置方法
        Dish FriedRice = new Dish();
        // 設定屬性
        FriedRice.setDishName("炒飯");
        FriedRice.setDishPrice(10);
        FriedRice.setDishNumber(1);

        // 第二種建置方法
        // 創建一個新的 Dish 物件及使用 Dish constructor
        Dish RoastChicken = new Dish("烤雞", 2, 100);
        Dish RoastDuck = new Dish("烤鴨", 3, 200);
        Dish RoastBeef = new Dish("烤大牛排", 4, 300);
        // 第三種建置方法：可以創建一個 arraylist 將菜品建置進去 然後進行遍歷

        /* 第四種建置方法： (前提 此方法返回類型為 Dish )
        public static Dish[] DishesInital() {
        return new Dish[]{
            new Dish("炒飯", 10, 1),
            new Dish("烤雞", 100, 2),
            new Dish("烤鴨", 200, 3),
            new Dish("烤大牛排", 300, 4)
        };
         */

        // 將菜品組合成一個字符串
        String menu = "菜單:\n";
        menu += "1. " + FriedRice.getDishName() + " - 價格: $" + FriedRice.getDishPrice() + "\n";
        menu += "2. " + RoastChicken.getDishName() + " - 價格: $" + RoastChicken.getDishPrice() + "\n";
        menu += "3. " + RoastDuck.getDishName() + " - 價格: $" + RoastDuck.getDishPrice() + "\n";
        menu += "4. " + RoastBeef.getDishName() + " - 價格: $" + RoastBeef.getDishPrice() + "\n";

        return menu;

    }

    // 顯示菜單的方法
    public static void ShowDishMenu(int FirstCommend){

        System.out.println(DishesInital());

        }

}

