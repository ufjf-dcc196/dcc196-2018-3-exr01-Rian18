package dcc196.ufjf.br.exercicio1_rian;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnAluno;
    private Button btnServidor;
    private Button btnExterno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAluno = (Button)findViewById(R.id.btn_ALuno);
        btnServidor = (Button)findViewById(R.id.btn_Servidor);
        btnExterno = (Button)findViewById(R.id.btn_Externo);

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
                Intent intent = new Intent(MainActivity.this, AlunoActivity.class);
                startActivity(intent);

            }
        });

        btnExterno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AlunoActivity.class);
                startActivity(intent);

            }
        });


    }
}
