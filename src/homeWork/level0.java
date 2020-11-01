package homeWork;
//使用while，do...while,for 循环1-100的数字，在50的时候跳出循环一次循环（不打印50）
public class level0 {
    public static void main(String[] args) {
//        for(int i = 1;i <= 100;i++){
//            if(i == 50){
//                continue;
//           }
//           System.out.println(i);
//    }
//        System.out.println("--------------------");
//           int a = 0;
//            while(a < 100) {
//               a++;
//                if (a == 50) {
//                    continue;
//               }
//                    System.out.println(a);
//
//               }
          System.out.println("----------------------");
          int j = 0;
            do{
                j++;
                if(j == 50){
                    continue;
                }
                System.out.println(j);

            }while(j < 100);




    }
}