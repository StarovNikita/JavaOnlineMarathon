import java.util.List;

class ArrayUtil {

    // Write static method setAndReturn(...) here
    public static <T> T setAndReturn(T[] arr,T obj, int pos){
        arr[pos] = obj;
        return (T) obj;
    }
}
