public class Main {
    public static void main(String[] args) {
        String login = "StudentSkyPro";
        String password = "JavaDeveloper";
        String confirmPassword = "JavaDeveloper";
        try {
            ServiceRegistration.registrationOfAccount(password, login, confirmPassword);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

}