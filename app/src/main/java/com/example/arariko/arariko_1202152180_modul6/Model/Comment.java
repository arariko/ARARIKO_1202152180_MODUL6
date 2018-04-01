package com.example.arariko.arariko_1202152180_modul6.Model;
import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by Arariko on 01/04/2018.
 */
@IgnoreExtraProperties
public class Comment {
    public String uid;

    public String author;

    public String text;



    public Comment() {

        // Default constructor required for calls to DataSnapshot.getValue(Comment.class)

    }



    public Comment(String uid, String author, String text) {

        this.uid = uid;

        this.author = author;

        this.text = text;

    }
}
