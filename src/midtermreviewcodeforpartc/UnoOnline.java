/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermreviewcodeforpartc;

import java.util.Scanner;


public class UnoOnline {

   private static User users[] = new User[100];

   public static void main(String[] args) {

        PasswordValidator newPortal = new PasswordValidator();
        newPortal.run();
        int userCount = 0;
       User newPlayer = new User(newPortal.getlahlah(), newPortal.getPass());


       users[userCount] = newPlayer;
       userCount++;
       System.out.println("New player on the board!");
       System.out.println("PlayerName: " + newPortal.getlahlah());
   }
    private static class PasswordValidator {

        public PasswordValidator()  {

        this.password = "";
    }
    public void setUName(String LAHLAH)

    {
        this.userName = LAHLAH;

    }
    public void setPass(String pass)
    {

        this.password = pass;
    }
    public String getlahlah()

    {
        return userName;

    }
    public String getPass()

    {

        return password;

    }

    public void run()  {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter PlayerName:");

       userName = sc.nextLine();

       boolean validPassword = false;

       while (!validPassword) 
       {
           System.out.println("Pass to have at least eight characters");
           System.out.println("Pass to have a one special character minimum");
           System.out.println("Enter your pass:");

           password = sc.nextLine();
           int specialCharCount = 0;

           for (int i = 0; i < password.length(); i++) 
           {
               if (!(Character.isLetterOrDigit(password.charAt(i)))) 

               {
                   specialCharCount++;
               }
           }
           if (specialCharCount > minSpecialChar && password.length() > minPasLength) 
           {
               validPassword = true;
           }
       }
    }

}
}