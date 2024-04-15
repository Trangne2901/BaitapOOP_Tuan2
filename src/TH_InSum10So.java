public class TH_InSum10So {
    public static void main(String[] args) {
        //For
        int sum = 0;
        for( int i = 0; i<10;i++){
            sum+=i;
        }
//        //While
//        int sum = 0;
//        int count =1;
//        while (count <10){
//            sum += count;
//            count ++;
//        }
//        //do - while
//        int sum = 0;
//        int count = 0;
//        do{
//            sum += count;
//            count ++;
//        }while (count<10);
        System.out.println("Tổng 10 số tự nhiên đầu tiên là :" + sum);
    }
}

