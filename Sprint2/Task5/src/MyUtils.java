import java.util.ArrayList;
import java.util.List;

class Rectang {
    // Code
    private double height;
    private double width;
    public Rectang(double height,double width){
        this.width = width;
        this.height = height;
    }
    public double getPerimeter(){

        return 2*(height+width);
    }
}
class Square {
    // Code
    private double width;
    public Square(double width){
        this.width = width;
    }
    public  double getPerimeter(){
        return 2*(width+width);
    }
}
public class MyUtils {
    public double sumPerimeter(List<?> firures) {
        // Code
        double sum=0;
        for (int i = 0; i<firures.size();i++){
            if (firures.get(i) instanceof Rectang)
                sum+=((Rectang) firures.get(i)).getPerimeter();
            if (firures.get(i) instanceof Square)
                sum+= ((Square) firures.get(i)).getPerimeter();
        }
        return sum;
    }
}
