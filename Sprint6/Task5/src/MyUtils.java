import java.util.HashSet;
import java.util.function.Predicate;
import java.util.Set;

class MyUtils{

    // Write your code here
    public static Predicate getPredicateFromSet(Set<Predicate<Integer>> predicateSet){
        Predicate allPredicate = predicateSet.stream().reduce(x-> true,Predicate::and) ;
        return allPredicate;
    }

}

