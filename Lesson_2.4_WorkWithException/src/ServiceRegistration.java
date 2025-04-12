import java.util.Arrays;

public class ServiceRegistration {


    private static void checkLogin(String login) {
        boolean result = login.matches("\\w{6,20}");// минимальная длина логина и пароля не была оговорина в условии задачи, установил сам, обычно при регистрации оговариают этот момент

        if (!result) {
            throw new WrongLoginException("Логин имеет не верный формат или длинна логина не коректна!!!");
        }
    }

    private static void checkPassword(String password, String confirmPassword) {
        boolean result = password.matches("\\w{6,20}");
        if (!result) {
            throw new WrongPasswordException("Пароль имеет не верный формат или длинна пароля не коректна!!!");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают, попробуйте еще раз!!!");
        }
    }


    public static void registrationOfAccount(String password, String login, String confirmPassword) {
        checkLogin(login);
        checkPassword(password, confirmPassword);



    }
}
