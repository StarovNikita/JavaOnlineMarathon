import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Employee {
    // Code
    private String name;
    private int experience;
    private BigDecimal basePayment;
    public String getName() {
        return name;
    }
    public int getExperience() {
        return experience;
    }
    public BigDecimal getPayment() {
        return basePayment;
    }

    public Employee(String name, int experience, BigDecimal basePayment) {
        this.name = name;
        this.experience = experience;
        this.basePayment = basePayment;
    }

    ;
}
class Manager extends Employee {
    // Code
    private double coefficient;

    public Manager(String name, int experience, BigDecimal basePayment, double coefficient) {
        super(name, experience, basePayment);
        this.coefficient = coefficient;
    }

    public double getCoefficient() {
        return coefficient;
    }
    @Override
    public BigDecimal getPayment() {
        return super.getPayment().multiply(BigDecimal.valueOf(coefficient));
    }
}
public class MyUtils {
    public List<Employee> largestEmployees(List<Employee> workers) {
        // Code
        List<Employee> LargestEmployees = new ArrayList<>();

        return LargestEmployees;
    }
}