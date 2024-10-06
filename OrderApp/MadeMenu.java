package OrderApp;

import java.util.Scanner;

public class MadeMenu {

    public int FirstCommend;
    public int SecondCommend;

    public static void ShowMainMenu() {

        // 印出菜單項目
        System.out.printf("1. 全店菜品顯示 ");
        System.out.printf("2. 已點項目 ");
        System.out.printf("3. 結帳 ");

    }

    public static int customerCommand() {
        // 接收客戶號碼回傳內容
        Scanner s = new Scanner(System.in);
        // 接收客戶輸入並直接回傳
        return s.nextInt();
    }

}
