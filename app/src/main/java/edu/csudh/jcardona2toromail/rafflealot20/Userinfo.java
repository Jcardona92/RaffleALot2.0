package edu.csudh.jcardona2toromail.rafflealot20;

import java.util.Scanner;

/**
 * Created by akajo on 3/6/2017.
 */

public class Userinfo {
    private String username , password, email;

    public Userinfo(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Userinfo{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    public void RequestNewPass(){
        Scanner input = new Scanner(System.in);
        String newpassword = input.nextLine();
        setPassword(newpassword);

    }

}
