public class LandAnimal extends Animal{

    public String name;
    String move() {
        return "swings on tree";
    }
    public static void main(String[] args) {
        LandAnimal lion = new LandAnimal();
        lion.name = "leo";
        LandAnimal monkey = new LandAnimal();
        System.out.println(lion.move());
        System.out.println(monkey.move());
    }
}
