package registration;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adja meg a nevét");
        String name = scanner.nextLine();
        System.out.println("Kérem adja meg a jelszavát");
        String password1 = scanner.nextLine();
        System.out.println("Kérem adja meg a jelszavát újra");
        String password2 = scanner.nextLine();
        System.out.println("Kérem adja meg az emailcímét");
        String email = scanner.nextLine();

        UserValidator uv = new UserValidator();
        System.out.println(uv.isValidUsername(name)? "jó név" : "nemjónév");
        System.out.println(uv.isValidPassword(password1,password2)? "A jelszó helyes": "A jelszónak legalább 8 karakter hosszúnak kell lennie!");
        System.out.println(uv.isValidEmail(email)? "Az email cím helyes!": "Az email cím helytelen!");

    }
}
