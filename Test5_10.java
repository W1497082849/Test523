package Test523;

class  Test5_10_1{
    public static int sum = 1 ;
    public Test5_10_1(){
        sum = sum + 5 ;
    }
}
public class Test5_10 {
    public static void main(String[] args) {
        Test5_10_1 test5_10_1 = new Test5_10_1();
        Test5_10_1 test5_10_11 = new Test5_10_1();
        Test5_10_1 test5_10_112 = new Test5_10_1();
        System.out.println(test5_10_1.sum);
    }
}

