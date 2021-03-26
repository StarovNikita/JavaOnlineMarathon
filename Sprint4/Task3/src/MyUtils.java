import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
public class MyUtils {
    // Code
    public boolean listMapCompare(List<String> list, Map<String, String> map) {
        // Code
        if (list.isEmpty() || map.isEmpty())
            return false;
        boolean result = false;
        for (int i = 0; i < list.size(); i++) {
            if(map.containsValue(list.get(i))){
                result = true;
            }
            else
                result = false;
        }
        return result;
    }
}
