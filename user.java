public class user {
    String username = "oluwaseyi aaron Joseph";
    String email = "oluwaseyi.joseph@binghamuni.edu.ng";
    String login() {
        if(username.equals("Oluwaseyi aaron joseph") &&  email.equals("oluwaseyi.joseph@binghamuni.edu.ng")) {
            return "Logged in";
        } else {
            return "Failed";
        }
    }
    public static void main(String[] args) {
        user jane = new user();
        System.out.println(jane.login());
    }
}
