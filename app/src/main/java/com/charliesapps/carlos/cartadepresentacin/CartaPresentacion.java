package com.charliesapps.carlos.cartadepresentacin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CartaPresentacion extends AppCompatActivity {
    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carta_presentacion);
        texto = (TextView) findViewById(R.id.text);
    }
}
