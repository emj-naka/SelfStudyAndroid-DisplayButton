package com.example.emj.displaybutton;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setBackgroundColor(Color.WHITE);
        layout.setGravity(Gravity.BOTTOM);

        layout.setOrientation(LinearLayout.HORIZONTAL);
        setContentView(layout);

        Button button = new Button(this);
        button.setText("Button1");
        button.setTag("Button1");
        button.setOnClickListener(this);
        button.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));

        layout.addView(button);



        Button button2 = new Button(this);
        button2.setText("Button2");
        button2.setTag("Button2");
        button2.setOnClickListener(this);
        button2.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));

        layout.addView(button2);


    }

    public void onClick(View view) {
        Log.d("Info", "Click Button:" + (String)view.getTag());
    }
}
