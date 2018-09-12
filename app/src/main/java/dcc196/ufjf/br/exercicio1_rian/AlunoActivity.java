package dcc196.ufjf.br.exercicio1_rian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AlunoActivity extends AppCompatActivity {
    private TextView txtServidor;
    private Button btnEnviarServidor;
    private EditText edtNomeServidor;
    private EditText edtSiape;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aluno);
    }
}
