package dcc196.ufjf.br.exercicio1_rian;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String SERV_NOME = "SERVIDOR";
    public static final String SERV_SIAPE = "SIAPE";

    public static final String ALUNO_NOME = "ALUNO";
    public static final String ALUNO_MAT = "MATRICULA";

    public static final String EXTERNO_NOME = "EXTERNO";
    public static final String EXTERNO_EMAIL= "EMAIL";

    private static final int REQUEST_SERVIDOR = 0;
    private static final int REQUEST_ALUNO = 1;
    private static final int REQUEST_EXTERNO = 2;

    private Button btnAluno;
    private Button btnServidor;
    private Button btnExterno;

    private TextView txtServidor;
    private TextView txtAluno;
    private TextView txtExterno;

    int somaServidor = 0;
    int somaAluno = 0;
    int somaExterno = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAluno = (Button)findViewById(R.id.btn_ALuno);
        btnServidor = (Button)findViewById(R.id.btn_Servidor);
        btnExterno = (Button)findViewById(R.id.btn_Externo);

        txtServidor = (TextView) findViewById(R.id.txt_Servidor);
        txtAluno = (TextView) findViewById(R.id.txt_Aluno);
        txtExterno = (TextView) findViewById(R.id.txt_Externo);

        btnAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AlunoActivity.class);
                startActivityForResult(intent, MainActivity.REQUEST_ALUNO);
            }
        });

        btnServidor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ServidorActivity.class);
                startActivityForResult(intent, MainActivity.REQUEST_SERVIDOR);

            }
        });

        btnExterno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ExternoActivity.class);
                startActivityForResult(intent, MainActivity.REQUEST_EXTERNO);

            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode)
        {
            case 0:
                if(resultCode == Activity.RESULT_OK && data != null) {
                    Bundle bundleResultado = data.getExtras();
                    String nomeServ = bundleResultado.getString(MainActivity.SERV_NOME);
                    String siape = bundleResultado.getString(MainActivity.SERV_SIAPE);
                    somaServidor = somaServidor + 1;
                    txtServidor.setText("Último servidor : " + nomeServ + " - " + siape + " Quantidade : " + String.valueOf(somaServidor));

                }
                break;
            case 1:
                if(resultCode == Activity.RESULT_OK && data != null) {
                    Bundle bundleResultado1 = data.getExtras();
                    String nomeAluno = bundleResultado1.getString(MainActivity.ALUNO_NOME);
                    String matricula = bundleResultado1.getString(MainActivity.ALUNO_MAT);
                    somaAluno = somaAluno + 1;
                    txtAluno.setText("Último aluno : " + nomeAluno + " - " + matricula + " Quantidade : " + String.valueOf(somaAluno));

                }
                break;

            case 2:
                if(resultCode == Activity.RESULT_OK && data != null) {
                    Bundle bundleResultado1 = data.getExtras();
                    String nomeExterno = bundleResultado1.getString(MainActivity.EXTERNO_NOME);
                    String email = bundleResultado1.getString(MainActivity.EXTERNO_EMAIL);
                    somaAluno = somaAluno + 1;
                    txtAluno.setText("Último aluno : " + nomeAluno + " - " + matricula + " Quantidade : " + String.valueOf(somaAluno));

                }
                break;
        }


    }
}
