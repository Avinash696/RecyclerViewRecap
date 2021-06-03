package com.personal.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
RecyclerView rv;
String arr[]={"AVi","jj","kk","dd","vv","cc"};
int img[] ={R.drawable.dice_1,R.drawable.dice_2,R.drawable.dice_3,
        R.drawable.dice_4,R.drawable.dice_5,R.drawable.dice_6};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        rv.setLayoutManager(new LinearLayoutManager(this));
        AdapterRec adapterRec=new AdapterRec(arr,img,this);
        rv.setAdapter(adapterRec);
    }
    void init(){
        rv=findViewById(R.id.rv);
    }
}