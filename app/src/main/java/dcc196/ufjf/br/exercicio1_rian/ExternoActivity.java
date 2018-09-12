package dcc196.ufjf.br.exercicio1_rian;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ExternoActivity extends AppCompatActivity {
    private TextView txtExterno;
    private Button btnEnviarExterno;
    private EditText edtNomeExterno;
    private EditText edtEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_externo);

        txtExterno = (TextView) findViewById(R.id.txt_Label3);
        btnEnviarExterno = (Button) findViewById(R.id.btn_EnviarExterno);
        edtNomeExterno = (EditText) findViewById(R.id.edt_NomeExterno);
        edtEmail = (EditText) findViewById(R.id.edt_Email);

        Bundle extras = getIntent().getExtras();

        btnEnviarExterno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultado = new Intent();
                resultado.putExtra(MainActivity.EXTERNO_NOME,edtNomeExterno.getText().toString());
                resultado.putExtra(MainActivity.EXTERNO_EMAIL,edtEmail.getText().toString());
                setResult(Activity.RESULT_OK,resultado);
                finish();
            }
        });

        Toast.makeText(getApplicationContext(), "Inserção do Externo",Toast.LENGTH_SHORT).show();
    }}
