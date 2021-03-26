import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Comparator;

class Person{
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name:'" + name + ", Age;" + age;
    }
}
class Employee extends Person{
    private double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", salary:" + salary;
    }
}
class Developer extends Employee{
    private Level level;

    public Developer(String name, int age, double salary, Level level) {
        super(name, age, salary);
        this.level = level;
    }

    public Level getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return super.toString() + ", Level:" + level;
    }
}
enum Level{
    JUNIOR,
    MIDDLE,
    SENIOR
}
class PersonComparator implements Comparator<Type>{

    @Override
    public int compare(Type o1, Type o2) {
        return o1.getTypeName().compareTo(o2.getTypeName());
    }
}
class EmployeeComparator implements Comparator<Type>{

    @Override
    public int compare(Type o1, Type o2) {
        return o1.getTypeName().compareTo(o2.getTypeName());
    }
}
class DeveloperComparator implements Comparator<Type>{

    @Override
    public int compare(Type o1, Type o2) {
        return o1.getTypeName().compareTo(o2.getTypeName());
    }
}
public class Utility {
    public static void sortPeople(Array<? extends Person> array, Comparator<Type> comparator ){

    }
}
