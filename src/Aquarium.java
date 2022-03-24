import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Aquarium {

    List<Fish> fishList = new ArrayList<>();

    public void addFish(String name, int weight, String color, String stripeColor) {
        Fish clownFish = new ClownFish(name, weight, color, stripeColor);
        fishList.add(clownFish);
    }

    public void addFish(String name, int weight, String color, boolean shortTermMemoryLoss) {
        Fish tang = new Tang(name, weight, color, shortTermMemoryLoss);
        fishList.add(tang);
    }

    public void addFish(String name, int weight, String color) {
        Fish kong = new Kong(name, weight, color);
        fishList.add(kong);
    }

    public void feed(){
        for(Fish fish : fishList) {
            fish.feed();
        }
    }

    public void removeFish(){
        fishList = fishList
                .stream()
                .filter(c -> c.weight < 11)
                .collect(Collectors.toList());
    }

    public void getStatus(){
        for(Fish fish : fishList){
            fish.status();
        }
    }
}
