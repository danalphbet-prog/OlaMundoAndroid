package com.example.olamundo;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView texto = new TextView(this);
        texto.setText("Olá mundo");
        texto.setTextSize(28);
        texto.setTextColor(Color.BLACK);
        texto.setGravity(Gravity.CENTER);
        texto.setBackgroundColor(Color.WHITE);

        texto.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        ));

        setContentView(texto);
    }
}
