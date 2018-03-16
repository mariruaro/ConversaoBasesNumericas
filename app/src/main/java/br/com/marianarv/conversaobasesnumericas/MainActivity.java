package br.com.marianarv.conversaobasesnumericas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editValor;
    Button   buttonDecimal;
    Button   buttonBinario;
    Button   buttonOctal;
    Button   buttonHexadecimal;
    Button   buttonLimpar;
    EditText editResposta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editValor = (EditText) findViewById(R.id.editValor);
        buttonDecimal = (Button) findViewById(R.id.buttonDecimal);
        buttonBinario = (Button) findViewById(R.id.buttonBinario);
        buttonOctal = (Button) findViewById(R.id.buttonOctal);
        buttonHexadecimal = (Button) findViewById(R.id.buttonHexadecimal);
        buttonLimpar = (Button) findViewById(R.id.buttonLimpar);
        editResposta = (EditText) findViewById(R.id.editResposta);

        buttonBinario.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                int input = Integer.parseInt(editValor.getText().toString());
                String bin = Integer.toBinaryString(input);
                editResposta.setText(bin);
            }
        });

        buttonHexadecimal.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                int input = Integer.parseInt(editValor.getText().toString());
                String bin = Integer.toHexString(input);
                editResposta.setText(bin);
            }
        });

        buttonOctal.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                int input = Integer.parseInt(editValor.getText().toString());
                String bin = Integer.toOctalString(input);
                editResposta.setText(bin);
            }
        });

        buttonLimpar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                editValor.setText("");
                editResposta.setText("");
            }
        });

        buttonDecimal.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = editValor.getText().toString();

               int r = Integer.parseInt(str, 16);

                editResposta.setText(""+r);

            }
        });
    }
}
