package org.example.projectnoname;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.swing.*;

public class kalkulator {
    public static void main(String[] args) {

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String rawpassword = "ninnin02";
        String encodedpassword = encoder.encode(rawpassword);

        System.out.println(encodedpassword);


    }
}
