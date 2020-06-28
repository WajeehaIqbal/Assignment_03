package com.example.contactlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    private RecyclerView myRecyclerview;
    private TextView conn;
    private TextView connum;
    private TextView conm;
    private ArrayList<Contact> mContact=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        //Add text
        conn=(TextView)findViewById(R.id.contactname);
        connum=(TextView)findViewById(R.id.contactnumber);
        conm=(TextView)findViewById(R.id.contactemail);
        Intent i=getIntent();
        String conna=i.getStringExtra("Name");
        String connu=i.getStringExtra("Number");
        String conma=i.getStringExtra("E-mail");
        conn.setText(conna);
        connum.setText(connu);
        conm.setText(conma);


        myRecyclerview =(RecyclerView)findViewById(R.id.contactlist);
        LinearLayoutManager mLayoutmanager =new LinearLayoutManager(this);
        mLayoutmanager.setOrientation(LinearLayoutManager.VERTICAL);
        myRecyclerview.setLayoutManager(mLayoutmanager);
        //Create List

        mContact.add(new Contact("Alex sin",R.drawable.ic_add));
        mContact.add(new Contact("Anna",R.drawable.ic_add));
        mContact.add(new Contact("Omaima Ali",R.drawable.omaima));
        mContact.add(new Contact("John",R.drawable.ic_add));
        mContact.add(new Contact("Ruhma Khawaja",R.drawable.ruhma));
        mContact.add(new Contact("Saira Sabir",R.drawable.saira));
        mContact.add(new Contact("Wajeeha Iqbal",R.drawable.wajeeha));
        mContact.add(new Contact("Menu Item",R.drawable.ic_add));
        mContact.add(new Contact("Menu Item",R.drawable.ic_add));
        mContact.add(new Contact("Menu Item",R.drawable.ic_add));
        mContact.add(new Contact("Menu Item",R.drawable.ic_add));
        mContact.add(new Contact("Menu Item",R.drawable.ic_add));
        mContact.add(new Contact("Menu Item",R.drawable.ic_add));
        mContact.add(new Contact("Menu Item",R.drawable.ic_add));
        mContact.add(new Contact("Menu Item",R.drawable.ic_add));
        mContact.add(new Contact("Menu Item",R.drawable.ic_add));
        mContact.add(new Contact("Menu Item",R.drawable.ic_add));
        mContact.add(new Contact("Menu Item",R.drawable.ic_add));
        mContact.add(new Contact("Menu Item",R.drawable.ic_add));
        mContact.add(new Contact("Menu Item",R.drawable.ic_add));
        mContact.add(new Contact("Menu Item",R.drawable.ic_add));
        mContact.add(new Contact("Menu Item",R.drawable.ic_add));
        //Set Adapter
        RecyclerViewAdapter adapter=new RecyclerViewAdapter(mContact);
        myRecyclerview.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }


}
