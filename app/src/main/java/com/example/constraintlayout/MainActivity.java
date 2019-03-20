package com.example.constraintlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int buttonFontSize = 30;

    public void larger(View v){
        TextView cat_says;
        cat_says = findViewById(R.id.textView2);
        cat_says.setTextSize(++buttonFontSize);

    }
}
