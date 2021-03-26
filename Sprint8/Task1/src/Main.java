import java.util.function.BinaryOperator;

class ParallelCalculator implements Runnable{
    BinaryOperator<Integer> binaryOperator;
    int operand1;
    int operand2;
    int result;
    public ParallelCalculator(BinaryOperator<Integer> binaryOperator, int operand1, int operand2) {
        this.binaryOperator = binaryOperator;
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    @Override
    public void run() {
       result = binaryOperator.apply(operand1,operand2);
    }
}

class Accountant {
    public static int sum(int x, int y) {

        // Write your code here
        ParallelCalculator sum = new ParallelCalculator((x1, y1) -> x1+y1,x,y);
        Thread thread = new Thread(sum);
        thread.start();
        
        return sum.result;

    }
}
public class Main {
    public static void main(String[] args){
        System.out.println(Accountant.sum(3,5));
        System.out.println(Accountant.sum(115,2095));
    }
}