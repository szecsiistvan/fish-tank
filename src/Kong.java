public class Kong extends Fish{

    public Kong(String name, int weight, String color) {
        super(name, weight, color);
    }
    public void feed(){
        weight += 2;
    }
}
