import java.lang.reflect.Method;

public class MainExample {

    public static void main (String [] args){
        Method[] methods = MainExample.class.getMethods();

        for(Method method : methods){
            System.out.println("method = " + method.getName());
        }
    }


    public String sayHelloWorld() {
        return "HelloWorld";
    }
}
