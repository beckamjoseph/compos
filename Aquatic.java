public class Aquatic extends Animal {
    @Override
    String move() {
        return "Moves by swimming";
    }
    String name = "whale";
    public static void main(String[] args) {
        Aquatic whale = new Aquatic();
        System.out.println(whale.name + " " + whale.move());
    }
}
