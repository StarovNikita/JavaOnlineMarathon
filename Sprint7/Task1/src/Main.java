public class Main {
    public static boolean isLeapYear(int year) {
        // Write your code here
        if (year%4 == 0){
            if(year%100 == 0){
                if(year%400 == 0)
                    return true;
                else
                    return false;
            }
            return true;
        }
        return false;
    }
}
