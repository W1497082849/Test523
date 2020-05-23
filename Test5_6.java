package Test523;

class CodeBlock{
    private String slogan = "吃饭当节俭，粒粒皆辛苦！";
    private static String info = "一个静态成员";
    static {
        System.out.println("\n调用静态代码块");
        System.out.println(info);
    }
    {
        System.out.println("\n调用普通构造块开始");
        System.out.println(info);
        System.out.println(slogan);
        System.out.println("调用普通构造块结束");
    }
    public CodeBlock(){
        System.out.println("\n调用构造方法");
    }
}
public class Test5_6 {
    public static void main(String[] args) {
        new CodeBlock();
        System.out.println("\n注意！下面没有执行静态代码块！");
        new CodeBlock();
    }
}
