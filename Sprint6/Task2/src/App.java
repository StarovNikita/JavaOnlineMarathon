import java.util.function.Consumer;
public class App {

    public  static Consumer<double[]> cons = (arr) ->{
        for(int i = 0;i<arr.length;i++)
            if(arr[i]>2)
                arr[i]*=0.8;
            else
                arr[i]*=0.9;
    } ;
    public static double[] getChanged(double[] initialArray, Consumer<double[]> cons) {
        // Code
        double[] resultArray = new double[initialArray.length];
        for(int i = 0;i<initialArray.length;i++){
            resultArray[i] = initialArray[i];
        }
        cons.accept(resultArray);
        return resultArray;
    }

}
