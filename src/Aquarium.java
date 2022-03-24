import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Aquarium {

    List<Fish> fishList = new ArrayList<>();

    public void addFish(Fish fish) {
        fishList.add(fish);
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
