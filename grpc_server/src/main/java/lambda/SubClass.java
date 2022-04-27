package lambda;

/**
 * @ClassName: lambda.SubClass
 * @Description: lambda.SubClass
 * @Author: shenpengpeng
 * @Date: 2022-04-27 22:36
 * @Version: 1.0
 */
public class SubClass implements Factory {
    @Override
    public Object getObject() {
        return new user();
    }
}
