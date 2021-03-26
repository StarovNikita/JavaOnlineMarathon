import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface TestSuite {
     String[] value();
}

class TestSuitHandler {
    public static void run(Class<?> clazz)  {
        Method[] method = clazz.getDeclaredMethods();
        if (clazz.isAnnotationPresent(TestSuite.class)){
            for (Method count : method) {
                if (count.getName().equals(TestSuite.class.getName())) {
                    System.out.println("Method "+ count.getName() + "." + clazz.getSimpleName() + " started");
                    try {
                        count.invoke(count, (Object) count.getParameters());
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Method "+ count.getName() + "." +  clazz.getSimpleName()+ " finished");
                } else {
                    System.out.println("Method with name " + count.getName() + " doesn't exists or not public in class " + clazz.getSimpleName());
                }
            }
        }
        else {
            System.out.println("Class " + clazz.getSimpleName() + " isn't annotated");
        }
    }
}
