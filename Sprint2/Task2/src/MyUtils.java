import java.util.*;

interface DrinkReceipt {
    // Code
    String getName();
    DrinkReceipt addComponent(String componentName, int componentCount);
}
interface DrinkPreparation {
    // Code
    Map<String, Integer> makeDrink();
}
interface Rating {
    // Code
    int getRating();
}
class Caffee implements DrinkReceipt, DrinkPreparation, Rating {
    // Code
    private final String name;
    private final int rating;
    private final Map<String, Integer>  ingredients = new HashMap<>();
    public String getName(){
        return this.name;
    }
    public Caffee(String name,int rating ){
        this.rating = rating;
        this.name = name;
    }
    public DrinkReceipt addComponent(String componentName, int componentCount) {
        ingredients.put(componentName,componentCount);
        return this;
    }
    public Map<String, Integer> makeDrink(){
        addComponent("Water", 100).addComponent("Arabica", 20);
        return  ingredients;
    }
    public int getRating(){
        return this.rating;
    }
}
class Espresso extends Caffee {
    // Code
    private final Map<String, Integer> ingredientsEspresso= new HashMap<>();
    public Espresso( String name,int rating){
        super(name,rating);

    }
    public DrinkReceipt addComponent(String componentName, int componentCount) {
        ingredientsEspresso.put(componentName,componentCount);
        return this;
    }
    public Map<String, Integer> makeDrink(){
        addComponent("Water", 50).addComponent("Arabica", 20);
        return ingredientsEspresso;

    }
}
class Cappuccino extends Caffee {
    // Code
    private final Map<String, Integer> ingredientsCappucino= new HashMap<>();
    public Cappuccino ( String name,int rating){
        super(name,rating);
    }
    public DrinkReceipt addComponent(String componentName, int componentCount) {
        ingredientsCappucino.put(componentName,componentCount);
        return this;
    }
    public Map<String, Integer> makeDrink(){
        addComponent("Water", 100).addComponent("Arabica", 20).addComponent("Milk",50);
        return ingredientsCappucino;
    }
}
public class MyUtils {

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass().getName() == this.getClass().getName())
            return true;
        return false ;
    }

    public Map<String, Double> averageRating(List<Caffee> coffees) {
        // Code
        Map<String,Double> avarageRating= new HashMap<>();

        int countCaffe = 0;
        int countCappucino = 0;
        int countEspresso = 0;
        double AvarageRatingCaffe = 0;
        double AvarageRatingCappucino = 0;
        double AvarageRatingEspresso= 0;
        if (coffees.isEmpty()){
            avarageRating.clear();
            return avarageRating;
        }
        for (int i = 0;i<coffees.size();i++){

            if(coffees.get(i).getName().equals("Caffe")){
                countCaffe++;
                AvarageRatingCaffe+=coffees.get(i).getRating();
            }
            if (coffees.get(i).getName().equals("Cappucino")){
                countCappucino++;
                AvarageRatingCappucino+=coffees.get(i).getRating();
            }
            if (coffees.get(i).getName().equals("Espresso")){
                countEspresso++;
                AvarageRatingEspresso+=coffees.get(i).getRating();
            }

        }
        if(coffees.size()<2){
            avarageRating.put(coffees.get(0).getName(), (double) coffees.get(0).getRating());
        }
        else if(countCappucino!=0 ){
            avarageRating.put("Cappucino",AvarageRatingCappucino/countCappucino);
        }
        else if(countEspresso!=0){
            avarageRating.put("Espresso",AvarageRatingEspresso/countEspresso);
        }
        else if(countCaffe!=0){
            avarageRating.put("Caffe",AvarageRatingCaffe/countCaffe);
        }

        return avarageRating;
    }
}
