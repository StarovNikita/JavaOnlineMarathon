class Array<T>{
    private T[] array;
    public Array(T[] array){
        this.array = array;
    }
    public T get(int index){
        return array[index];
    }
    public int length(){
        return array.length;
    }
}
class ArrayUtil {

    // Write static method averageValue(...) here
    public static double averageValue(Array<? extends Number> arr) {
        double sumValue = 0.0;
        for (int i = 0; i < arr.length(); i++) {
            sumValue += arr.get(i).doubleValue();
        }

        return sumValue / arr.length();
    }
    public static void main(String[] args){
        Array<Integer> set1 = new Array<>(new Integer[] {1,2,3,4,5});
        double av = ArrayUtil.averageValue(set1);
        System.out.println(av);
    }
}