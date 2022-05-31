import java.lang.reflect.Method;

public class MainExample {

    public static void main (String [] args){
        Method[] methods = MainExample.class.getMethods();

        for(Method method : methods){
            System.out.println("method = " + method.getName());
            System.out.println("    parameter count = " + method.getParameterCount());
            Class<?>[] paramTypes = method.getParameterTypes();
            for (Class<?> className: paramTypes){
                System.out.println("    parameter type  = " + className);
            }

            System.out.println("================================================");
        }
    }


    public String sayHelloWorld(String foo, int num) {
        return "HelloWorld";
    }
}
