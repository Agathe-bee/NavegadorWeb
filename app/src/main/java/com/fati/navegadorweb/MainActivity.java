package com.fati.navegadorweb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Creación de objetos
    WebView nave;
    Button btnir;
    EditText txtUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nave = findViewById(R.id.webUrl);

        btnir = findViewById(R.id.buttonIr);

        txtUrl = findViewById(R.id.txturl);

        btnir.setOnClickListener(V->{

            String URL = txtUrl.getText().toString();
            nave.setWebViewClient(new WebViewClient());
            nave.loadUrl("https://" + URL);

        });

    }
}