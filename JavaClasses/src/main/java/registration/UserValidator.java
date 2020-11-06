package registration;

public class UserValidator {

    public boolean isValidUsername(String username){

        return (username.length() > 1);


    }
    public boolean isValidPassword(String password1, String password2){
        return (password1.equals(password2) && password1.length() >=8);


    }
    public boolean isValidEmail(String email){
       boolean emailisvalid = false;
        if(email.contains("@") && email.contains(".") ){
            int kukac = email.indexOf("@");
            int pont = email.indexOf(".");
            int hossz = email.length();

            if(pont > kukac && pont != hossz-1){
                emailisvalid = true;
            }
        }
        return emailisvalid;

    }
}
