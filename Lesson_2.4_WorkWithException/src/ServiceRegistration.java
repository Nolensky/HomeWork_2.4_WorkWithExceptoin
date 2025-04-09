public class ServiceRegistration {

    public static void registrationOfAccount(String password, String login, String confirmPassword) {

        int counter = 0;
        int counter2 = 0;
        String acceptableCharacters = ("1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM_");
        char[] symbols = new char[acceptableCharacters.length()];
        char[] passwordCharsArray = new char[password.length()];
        char[] loginCharsArray = new char[login.length()];

        acceptableCharacters.getChars(0, (acceptableCharacters.length()), symbols, 0);

        password.getChars(0, (password.length()), passwordCharsArray, 0);

        login.getChars(0, (login.length()), loginCharsArray, 0);

        for (int i = 0; i < loginCharsArray.length; i++) {
            char nextSymbol = loginCharsArray[i];
            for (int j = 0; j < acceptableCharacters.length(); j++) {
                if (nextSymbol != symbols[j]) {
                    continue;
                } else counter++;
            }
        }
        if (counter < loginCharsArray.length || loginCharsArray.length > 20) {
            throw new WrongLoginException("Логин имеет не верный формат или длинна логина больше допустимой!!!");
        }

        for (int i = 0; i < passwordCharsArray.length; i++) {
            char nextSymbol = passwordCharsArray[i];
            for (int j = 0; j < acceptableCharacters.length(); j++) {
                if (nextSymbol != symbols[j]) {
                    continue;
                } else counter2++;
            }
        }
        if (counter2 < passwordCharsArray.length || passwordCharsArray.length > 20) {
            throw new WrongPasswordException("Пароль имеет не верный формат или длинна пароля больше допустимой!!!");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совподают, попробуйте еще раз!!!");
        }

    }
}
