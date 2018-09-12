package dcc196.ufjf.br.exercicio1_rian;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String SERV_NOME = "NOME";
    public static final String SERV_SIAPE = "SIAPE";

    private static final int REQUEST_DADOS = 1;
    private Button btnAluno;
    private Button btnServidor;
    private Button btnExterno;
    private TextView txtServidor;

    int somaServidor = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAluno = (Button)findViewById(R.id.btn_ALuno);
        btnServidor = (Button)findViewById(R.id.btn_Servidor);
        btnExterno = (Button)findViewById(R.id.btn_Externo);

        txtServidor = (TextView) findViewById(R.id.txt_Servidor);

        btnAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AlunoActivity.class);
                //intent.putExtra(PESSOA_NOME, edtNome.getText().toString());
                startActivity(intent);
                //startActivityForResult(intent, MainActivity.REQUEST_SIAPE);
            }
        });

        btnServidor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ServidorActivity.class);
                startActivityForResult(intent, MainActivity.REQUEST_DADOS);

            }
        });

        btnExterno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ExternoActivity.class);
                startActivity(intent);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == MainActivity.REQUEST_DADOS && resultCode == Activity.RESULT_OK && data != null) {
            Bundle bundleResultado = data.getExtras();
            String nome = bundleResultado.getString(MainActivity.SERV_NOME);
            String siape = bundleResultado.getString(MainActivity.SERV_SIAPE);
            somaServidor = somaServidor + 1;
            txtServidor.setText("Último servidor : " + nome + " - " + siape + " Quantidade : " + String.valueOf(somaServidor));
        }
    }
}
