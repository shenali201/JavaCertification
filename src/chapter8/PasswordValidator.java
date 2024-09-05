package chapter8;

import java.util.Scanner;

public class PasswordValidator {

    private String username;
    private String currentPassword;
    private boolean valid;
    private static Scanner sc = new Scanner(System.in);

    public PasswordValidator(String uname, String pword){
        this.currentPassword = uname;
        this.username = pword;
    }

    public boolean isValid(){
        return valid;
    }

    public static void main(String arg[]){

        var validator = login();
        do{
            var regeneratePassword = validator.regeneratePassword();
            validator.recheckPassword(regeneratePassword);

            if (!validator.isValid()){
                System.out.println("Invalid Password!! ");
            }

        } while (!validator.isValid());
        System.out.println("Valid Password!! ");

        sc.close();
     }

     public static PasswordValidator login(){
         System.out.println("Enter Username: ");
         String username = sc.nextLine();
         System.out.println("Enter Password: ");
         String password = sc.nextLine();

         return new PasswordValidator(username,password);
     }

     public String regeneratePassword(){
         System.out.println("Enter a new password: ");
         String username = sc.nextLine();
         return username;
     }
     public void recheckPassword(String password){
        valid = true;
         if (password.length() < 8) {
             valid = false;
             System.out.println("Too short ");
         }
         if (password.equals(password.toLowerCase())) {
             valid = false;
             System.out.println("No caps ");
         }
         if (password.matches("[a-zA-Z0-9 ]*")) {
             valid = false;
             System.out.println("special characters ");
         }
         if (password.toUpperCase().contains(username.toUpperCase())) {
             valid = false;
             System.out.println("same username");
         }
         if (password.equals(currentPassword)) {
             valid = false;
             System.out.println("same as old password");
         }



     }

 }
