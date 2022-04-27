package lambda;

/**
 * @ClassName: lambda.Test01
 * @Description: lambda Test
 * @Author: shenpengpeng
 * @Date: 2022-04-27 22:42
 * @Version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        //0
        Factory02 factory = (int a, int b) -> {return a + b;};
        System.out.println(factory.method(1,2));
        //1
        Factory02 factory01 =(int a,int b)->a+b;
        System.out.println(factory01.method(5,6));
        //2
        Factory03 factory03 = msg-> System.out.println("aa"+msg);
        factory03.method("lambda");
        //3
        Factory02 factory04 = (a,b) -> a - b;
        System.out.println(factory04.method(1,2));

        System.out.println(Factory02.test());
    }
}
