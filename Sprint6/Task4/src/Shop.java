import java.util.ArrayList;
import java.util.List;

class Person{
    String name;

    Person(String name){
        this.name = name;
    }

    DecisionMethod goShopping = (name1, discount) -> {
        return name1 == "product1"  && discount > 10;
    }; // Write lambda here
}

// Create DecisionMethod interface here
interface DecisionMethod{
    public boolean decide(String name, int discount);
}

class Shop{
    public List<DecisionMethod> clients = new ArrayList<>();

    public int sale(String product, int percent) {

        // Write your code here
        int count = 0;
        for (DecisionMethod client : clients) {
            if (client.decide(product, percent))
                count++;
        }
        return count;
    }
}
