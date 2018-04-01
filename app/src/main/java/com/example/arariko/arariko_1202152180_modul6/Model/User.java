package com.example.arariko.arariko_1202152180_modul6.Model;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by Arariko on 01/04/2018.
 */
@IgnoreExtraProperties
public class User {

    public String username;

    public String email;
    public User() {

        // Default constructor required for calls to DataSnapshot.getValue(User.class)

    }

    public User(String username, String email) {

        this.username = username;

        this.email = email;

    }
}
