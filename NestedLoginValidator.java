public class NestedLoginValidator {
    public static void main(String[] args) {
        String inputUsername = "admin_user";
        String inputPassword = "correct_password";
        boolean isAccountLocked = false;

        String correctUsername = "admin_user";
        String correctPassword = "correct_password";

        if (inputUsername.equals(correctUsername)) {
            if (inputPassword.equals(correctPassword)) {
                if (!isAccountLocked) {
                    System.out.println("Login successful! Welcome.");
                } else {
                    System.out.println("Failure: Account is locked.");
                }
            } else {
                System.out.println("Failure: Incorrect password.");
            }
        } else {
            System.out.println("Failure: Incorrect username.");
        }
    }
}
