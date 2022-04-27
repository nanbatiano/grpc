package lambda;

/**
 * @ClassName: lambda.user
 * @Description: userTest
 * @Author: shenpengpeng
 * @Date: 2022-04-27 22:39
 * @Version: 1.0
 */
public class user {
    public String name;
    public String age;

    public user() {
    }

    public user(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String toString(){
        return "name:"+name+";age:"+age;
    }
}
