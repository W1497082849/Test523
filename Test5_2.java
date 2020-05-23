package Test523;

public class Test5_2 {

    private static int counter = 0 ;
    public Test5_2(String title){
        System.out.println("售出图书："+title);
        counter++;
    }
    public static int getCounter(){
        return  counter;
    }
}
