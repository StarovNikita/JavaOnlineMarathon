import java.util.function.Predicate;
import java.util.function.BiFunction;
import java.util.ArrayList;
import java.util.List;

class MyUtils{
    public static int findMaxByCondition(List<Integer> numbers, Predicate<Integer> pr) {

        // Write your code here
        int maxValue = 0;
        for (int num : numbers){
            if (pr.test(num))
                maxValue = num;
        }
        return maxValue;
    }
}

class User {
    public final List<Integer> values = new ArrayList<Integer>();



    int getFilterdValue(BiFunction<List<Integer>,Predicate<Integer>,Integer> biFunction, Predicate<Integer> pr){

        // Write your code here
        return biFunction.apply(values,pr);

    }

    int getMaxValueByCondition(Predicate<Integer> predicate) {

        // Write your code here
        return getFilterdValue(MyUtils::findMaxByCondition,predicate);


    }
}
