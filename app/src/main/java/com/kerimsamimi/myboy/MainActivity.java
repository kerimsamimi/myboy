package com.kerimsamimi.myboy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton imageButton;
        imageButton=(ImageButton)findViewById(R.id.imageButton);
    }

    public void play(View view){
        Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
        startActivity(intent);
    }
}
