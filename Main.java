public class Main {
    public static void main(String[] args) {
        int age;
        double height;
        String name;
        String password;

        age = 20;
        height = 5.0;
        name = "oluwaseyi-joseph";
        name.length();
        password = "beckamjoseph1234";
        if (password.contains("beckamjoseph") || password.contains("1234")) {
            System.out.println("Password is not strong enough");
        }
        
    }
}