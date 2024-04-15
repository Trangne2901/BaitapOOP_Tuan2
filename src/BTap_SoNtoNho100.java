import java.util.Scanner;

public class BTap_SoNtoNho100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Số nguyên tố nhỏ hơn 100 là:");

        int a = 1;
        int b = 2;

        while (a<100){
            boolean check = true;
            for (int i =2; i <= Math.sqrt(b); i++){
                if( b % i ==0){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.print(b + "," );
            }
            a++;
            b++;
        }
    }
}
