package Test523;

public class Test5_8 {
    static {
        System.out.println("TestStaticCode is loading");
    }
    Test5_8(){
        System.out.println("Call Custructor 1");
    }
    Test5_8(int a){
        System.out.println("Call Custructor 2");
    }

    public static void main(String[] args) {
        new Test5_8();
        new Test5_8(2);
    }
}
