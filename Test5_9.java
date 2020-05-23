package Test523;

public class Test5_9 {
    static  int x = 1 ;
    int y ;
    Test5_9(){
        y++;
    }

    public static void main(String[] args) {
        Test5_9 test5_9 = new Test5_9();
        System.out.println("x=" + x);
        System.out.println("test_9.y=" + test5_9.y);
        test5_9 = new Test5_9();
        System.out.println("test5_9.y=" + test5_9.y);
    }
    static {
        x++;
    }
    //知识点：类的每一次实例化都会调用构造方法；静态代码块只会被调用一次。
}
