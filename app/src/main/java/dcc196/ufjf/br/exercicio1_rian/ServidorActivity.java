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

public class ServidorActivity extends AppCompatActivity {
    private TextView txtServidor;
    private Button btnEnviarServidor;
    private EditText edtNomeServidor;
    private EditText edtSiape;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servidor);

        txtServidor = (TextView) findViewById(R.id.txt_Label2);
        btnEnviarServidor = (Button) findViewById(R.id.btn_EnviarServidor);
        edtNomeServidor = (EditText) findViewById(R.id.edt_NomeServidor);
        edtSiape = (EditText) findViewById(R.id.edt_Siape);

        Bundle extras = getIntent().getExtras();

        btnEnviarServidor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent resultado = new Intent();
                resultado.putExtra(MainActivity.SERV_NOME,edtNomeServidor.getText().toString());
                resultado.putExtra(MainActivity.SERV_SIAPE,edtSiape.getText().toString());


                setResult(Activity.RESULT_OK,resultado);
                finish();
            }
        });

               Toast.makeText(getApplicationContext(), "Inserção do Servidor",Toast.LENGTH_SHORT).show();
    }}

