package com.damiansuwala.helloandroid;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("Text/plain");
                String shareBody = "Your Body here";
                String shareSub = "Your Subject";
                myIntent.putExtra(Intent.EXTRA_TEXT,shareBody);
                myIntent.putExtra(Intent.EXTRA_SUBJECT,shareSub);
                startActivity(Intent.createChooser(myIntent,"Share using"));
            }
        });
    }


}
