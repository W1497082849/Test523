package Test523;

public class Test4_2 {
    public static void main(String[] args) {
        String str = new String("World");
        char ch [] = {'H','e','l','l','o'};
        change(str,ch);
        System.out.println(str+"and"+new String(ch));
    }
    public static void change(String str,char ch []){
        str = "Changed";
        ch[0] = 'C';
    }
}
