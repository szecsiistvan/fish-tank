public class ClownFish extends Fish{

    String stripeColor;

    public ClownFish(String name, int weight, String color, String stripeColor){
        super(name, weight, color);
        this.stripeColor = stripeColor;
    }

    public void status(){
        System.out.println(name + ", weight: " + weight + ", color: " + color + ", color of the stripes: " + stripeColor);
    }
}
