import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.time.LocalDate;


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Review{
    String reviewer();
    String date() default "today";
}

class Util{
    public static void  review(String className){
        try {
            Class<?> clazz = Class.forName(className);
            Review review = clazz.getAnnotation(Review.class);

            if(!clazz.isAnnotationPresent(Review.class)){
                System.out.println("Class " + className + " isn't marked as Reviewed");
            }
            else {
                if(review.date().equals("today")){
                    System.out.println("Class " + className + " was reviewed " + LocalDate.now() +  " by " + review.reviewer()  + ".");
                }
                else
                    System.out.println("Class " + className + " was reviewed " + review.date() +  " by " + review.reviewer()  + ".");
            }
        }catch (ClassNotFoundException e){
            System.out.println("Class " + className + " was not found");
        }
    }
}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface CamelCase {
}

class CheckCamelCase{
    public final static String CAMELCASE_PATTERN = "([a-z]+[A-Z]+\\\\w+)+";
    public static boolean checkAndPrint(Class<?> clazz){
        String methodName = clazz.getClass().getEnclosingMethod().getName();
        boolean isValid = true;
        if(!methodName.equals(CAMELCASE_PATTERN)){
            isValid = false;
            System.out.println("method " +  clazz.getSimpleName() + "." + methodName + " doesn't satisfy camelCase naming convention");
        }
        return isValid;
    }


}