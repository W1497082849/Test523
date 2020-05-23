package Test523;

import java.util.Random;

public class Test5_2_1 {
    public static void main(String[] args) {
        String [] bookTitle = { "利用案例轻松学习Java语言","Java编程思想","Java学习视频"};
        for (int i = 0 ; i < 4 ; i++){
            new Test5_2(bookTitle[new Random().nextInt(3)]);
        }
        System.out.println("总计销售了"+Test5_2.getCounter()+"本图书！");
    }
}
