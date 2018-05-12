package com.example.kustom.desafio01.models;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Nodes {

    private DatabaseReference root= FirebaseDatabase.getInstance().getReference();

    public DatabaseReference clients(){
        return root.child("address");
    }


}
