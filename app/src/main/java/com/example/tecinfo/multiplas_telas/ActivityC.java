package com.example.tecinfo.multiplas_telas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        TextView tidade = findViewById(R.id.t_nome);
        Button sair = findViewById(R.id.bt_fechar);

        Intent intentRecebido = getIntent();
        String idade = intentRecebido.getStringExtra("nome");

        tidade.setText(idade);

        sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
