package com.syntax.project2;

public class Registration {
    /*
    Create Registration Class in which you would have variables as email, userName and password
    that have an access scope only within its own class.
    After creating an object of the class user should be able to call methods and in each method separately
    pass values to set users email, username and password.
    Requirements:
    Valid email consider to be only yahoo
    Valid userName and password cannot be empty and should be of length larger than 6 characters.
    Also valid password cannot contain userName.
     */

    private String email;
    private String userName;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(!email.contains("yahoo")){
            System.out.println("Please use a yahoo email for registration");
        }else{
            this.email = email;
            System.out.println("Your email has been accepted");
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if(userName.isEmpty()||userName.length()<=6){
            System.out.println("Username cannot be left empty and must contain more than 6 characters");
        }else{
            this.userName = userName;
            System.out.println("Your username has been accepted");
        }

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.isEmpty()||password.length()<=6||password.contains(userName)){
        System.out.println("Password cannot be left empty and must contain more than 6 characters and not contain username");
         }else{
            this.password = password;
            System.out.println("Your password has been accepted");
    }

    }
}
class User extends Registration{
    public static void main(String[] args) {
        User user=new User();
        user.setEmail("kaydin@yahoo.com");
        user.setUserName("kaydin0409");
        user.setPassword("password123");
        System.out.println(user.getEmail());
        System.out.println(user.getUserName());
        System.out.println(user.getPassword());
    }


}
