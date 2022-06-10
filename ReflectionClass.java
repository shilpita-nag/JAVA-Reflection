package MMT.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionClass {
    public static void main(String args[]) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ReflectedClass r = new ReflectedClass();

        Class c = r.getClass();

        System.out.println("class name" + c.getName());

        Constructor constructor = c.getConstructor();

        System.out.println("constructor name " + constructor.getName());

        Method[] methods = c.getMethods(); //get you only public methods

        for(Method m : methods) {
            System.out.println("method name" + m.getName());
        }

        Method methodCall = c.getDeclaredMethod("method2");//("method2",int.class) for method with int parameter
        methodCall.setAccessible(true); // without this call you get IllegalAccessException
        methodCall.invoke(r);
    }
}
