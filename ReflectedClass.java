package MMT.Reflection;

public class ReflectedClass {

    private String s;

    public ReflectedClass() {
        s = "Inside Reflected COnstructor";
    }

    public void method1() {
        System.out.println("Method 1");
    }

    private void method2() {
        System.out.println("Method2");
    }
}
