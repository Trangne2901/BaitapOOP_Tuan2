import java.util.Scanner;

public class TH_ChovayLai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tiengui = 1.0;
        int thang = 1;
        double laisuat = 5.0;
        System.out.println("Nhập số tiền gửi:");
        tiengui = sc.nextDouble();
        System.out.println("Số tháng gửi:");
        thang = sc.nextInt();
        System.out.println("Số lãi gửi:");
        laisuat = sc.nextDouble();
        double tong = 0;
        for (int i = 0; i < thang; i++) {
            tong += thang * (laisuat / 100) / 12 * thang;
            System.out.println("Tổng số tiền lãi là:" + tong);
        }
    }
}
