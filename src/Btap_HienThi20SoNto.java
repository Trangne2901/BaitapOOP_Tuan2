import java.util.Scanner;

public class Btap_HienThi20SoNto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("20 số nguyên đầu tiên là: ");



        int a = 1;//Biến được sử dụng để đếm số lượng số nguyên tố đã được tìm thấy. Khi a đạt được giá trị 20, vòng lặp sẽ dừng.
        int number = 2;//bắt đầu số nguyên tố đầu tiên


        while (a < 20) {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }



            if (check) {
                System.out.print(number + ", ");
                a++;

            }
            number++;
        }
    }
}
