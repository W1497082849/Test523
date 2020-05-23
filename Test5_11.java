package Test523;

public class Test5_11 {
    public static void main(String[] args) {
    Melon m1=new Melon(10),m2=new Melon(12);
        System.out.println("TotalWeight"+Melon.getTotalWeight());
        System.out.println("TotalNumber"+Melon.getTotalNumber());
        m1.reduce();
        System.out.println("TotalWeight"+Melon.getTotalWeight());
        System.out.println("TotalNumber"+Melon.getTotalNumber());
    }
}
class Melon {
    float weight;
    private  static  float totalWeight = 0 ;
    private  static  int  totalNumber = 0 ;
    public  Melon(float w){
        weight = w;
        totalWeight = weight ;
        totalNumber ++;
    }
    public void reduce(){
        totalWeight-=weight;
        totalNumber--;
    }
    static float getTotalWeight(){
        return  totalWeight;
    }
    static int getTotalNumber(){
        return totalNumber;
    }
}
