import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Person {
    // Code
    private String name;
    public String getName(){
        return name;
    }
    public Person(String name){
        this.name = name;

    }
}
class Student extends Person {
    // Code
    private String studyPlace;
    private int studyYears;

    public Student(String name, String studyPlace,int studyYears) {
        super(name);
        this.studyPlace = studyPlace;
        this.studyYears = studyYears;

    }

    public int getStudyYears() {
        return studyYears;
    }
    public String getStudyPlace(){
        return studyPlace;
    }
}
class Worker extends Person {
    // Code
    private String workPosition;
    private int experienceYears;

    public Worker(String name,String workPosition, int experienceYears) {
        super(name);
        this.workPosition = workPosition;
        this.experienceYears = experienceYears;
    }

    public int getExperienceYears() {
        return experienceYears;
    }
    public String getWorkPosition() {
        return workPosition;
    }

}

public class MyUtils {

    int MaxExperienceYears;
    int MaxStudyYears;
    public List<Person> maxDuration(List<Person> persons) {
        // Code
        persons = new ArrayList<>();
        List<Person> MaxDurarionList = new ArrayList<>();
       if(persons.isEmpty()){
           return persons;
       }
       for (int i = 0;i<persons.size();i++){
           
       }

        return MaxDurarionList ;
    }
}
