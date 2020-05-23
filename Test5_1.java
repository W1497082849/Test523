package Test523;

public class Test5_1 {
    public static void main(String[] args) {
        String id = "000003165405049842";
        String year = id.substring(6,10);
        String month = id.substring(10,12);
        String day = id.substring(12,14);
        System.out.print("爱新觉罗·玄烨出生于 ");
        System.out.print(year+"年"+month+"月"+day+"日");
    }
}
