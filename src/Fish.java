public class Fish {

    String name;
    int weight;
    String color;

    public Fish(String name, int weight, String color) {
        this.name = name;
        this. weight = weight;
        this.color = color;
    }

    public void feed(){
        this.weight++;
    }
    public void status(){
        System.out.println(name + ", weight: " + weight + ", color: " + color);
    }
}
