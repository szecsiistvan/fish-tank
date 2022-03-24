public class Tang extends Fish{

    boolean shortTermMemoryLoss;

    public Tang(String name, int weight, String color, boolean shortTermMemoryLoss){
        super(name, weight, color);
        this.shortTermMemoryLoss = shortTermMemoryLoss;
    }

    public void status(){
        System.out.println(name + ", weight: " + weight + ", color: " + color + ", short-term memory loss: " + shortTermMemoryLoss);
    }

}
