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

public class AlunoActivity extends AppCompatActivity {
    private TextView txtAluno;
    private Button btnEnviarAluno;
    private EditText edtNomeAluno;
    private EditText edtMatricula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aluno);

        txtAluno = (TextView) findViewById(R.id.txt_Label);
        btnEnviarAluno = (Button) findViewById(R.id.btn_EnviarAluno);
        edtNomeAluno = (EditText) findViewById(R.id.edt_NomeAluno);
        edtMatricula = (EditText) findViewById(R.id.edt_Matricula);

        Bundle extras = getIntent().getExtras();

        btnEnviarAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent resultado = new Intent();
                resultado.putExtra(MainActivity.ALUNO_NOME,edtNomeAluno.getText().toString());
                resultado.putExtra(MainActivity.ALUNO_MAT,edtMatricula.getText().toString());
                setResult(Activity.RESULT_OK,resultado);
                finish();
            }
        });

        Toast.makeText(getApplicationContext(), "Inserção do Aluno",Toast.LENGTH_SHORT).show();
    }}