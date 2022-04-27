package lambda;

/**
 * @ClassName: lambda.Test01
 * @Description: lambda Test
 * @Author: shenpengpeng
 * @Date: 2022-04-27 22:42
 * @Version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        Factory factory = new SubClass();
        user u = (user) factory.getObject();
        System.out.println(u);
        //1
        factory = new Factory() {
            @Override
            public Object getObject() {
                return new user("张三","15");
            }
        };
        user u1 = (user) factory.getObject();
        System.out.println(u1);
        //2
        factory = ()->{
            return new user("李四","18");
        };
        user u2 = (user) factory.getObject();
        System.out.println(u2);

        //3
        user u3 = (user)getUserFromFactory(()->{return new user("王五","20");},"user");
        System.out.println(u3);

        factory = getFactory();
        user u4 = (user) factory.getObject();
        System.out.println(u4);
    }

    public static user getUserFromFactory(Factory factory,String beanName){
        Object o = factory.getObject();
        if(o != null && o.getClass().getSimpleName().equals(beanName)){
            return (user) o;
        }
        return null;
    }

    public static Factory getFactory(){
        return () -> {
            return new user("赵9","29");
        };
    }
}
