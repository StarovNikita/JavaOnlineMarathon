import java.lang.reflect.Type;
import java.util.function.BinaryOperator;
import java.util.ArrayList;
import java.util.List;

class Person{
    String name;
    String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}

public class App {

    // Write your code here
    public static BinaryOperator<String> greetingOperator = (parameter1, parameter2) -> "Hello" +  parameter1 + " " +  parameter2 + "!!!";
    public static List<String> createGreetings(List<Person> people,BinaryOperator<String> greetingOperator){

        // Write your code here
        List<String> resultList = new ArrayList<>();
        for (Person person : people) {
            resultList.add(greetingOperator.apply(person.name, person.surname));
        }
        return resultList;
    }
}
