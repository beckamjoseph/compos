public class FirstClass {
        int age;
    float height;
    String name;
    String password;

    void printUserDetails() {
        age = 20;
        height = 123;
        name = "Beckam";
        name.length();
        password = "beckam123";
        if (password.contains("beckam") || password.contains("123")) {
            System.out.println("password is not strong enough");
        }
    }
}
