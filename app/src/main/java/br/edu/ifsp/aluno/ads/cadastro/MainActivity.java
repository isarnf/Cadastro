package br.edu.ifsp.aluno.ads.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private EditText txtNomeCompleto;
    private EditText txtTelefone;
    private EditText txtEmail;
    private EditText txtCidade;
    private CheckBox ckIngressarListaEmail;
    private RadioButton rdSexoMasculino;
    private RadioButton rdSexoFeminino;
    private Spinner listaUf;
    private Button btnLimpar;
    private Button btnSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNomeCompleto = findViewById(R.id.txtNomeCompleto);
        txtTelefone = findViewById(R.id.txtTelefone);
        txtEmail = findViewById(R.id.txtEmail);
        txtCidade = findViewById(R.id.txtCidade);
        ckIngressarListaEmail = findViewById(R.id.ckIngressarListaEmail);
        rdSexoMasculino = findViewById(R.id.rdSexoMasculino);
        rdSexoFeminino = findViewById(R.id.rdSexoFeminino);
        listaUf = findViewById(R.id.listaUf);
        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);

        btnSalvar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Formulario formulario = new Formulario();

                if(txtNomeCompleto.getText().toString().equals("") || txtTelefone.getText().toString().equals("") || txtCidade.getText().toString().equals("") || txtEmail.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Todos os campos devem ser preenchidos! Tente novamente!", Toast.LENGTH_LONG).show();
                }else{
                    if(rdSexoFeminino.isChecked()){
                        formulario = new Formulario(txtNomeCompleto.getText().toString(), txtTelefone.getText().toString(),  txtEmail.getText().toString(), txtCidade.getText().toString(),String.valueOf(ckIngressarListaEmail.isChecked()),(String) rdSexoFeminino.getText(),listaUf.getSelectedItem().toString());
                        System.out.println(formulario);
                    }else{
                        formulario = new Formulario(txtNomeCompleto.getText().toString(), txtTelefone.getText().toString(), txtEmail.getText().toString(), txtCidade.getText().toString(),String.valueOf(ckIngressarListaEmail.isChecked()),(String) rdSexoMasculino.getText(),listaUf.getSelectedItem().toString());
                        System.out.println(formulario);
                    }
                }

                Toast.makeText(getApplicationContext(), formulario.toString(), Toast.LENGTH_LONG).show();

                limparCampos();
//
            }
        });

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                limparCampos();
            }
        });

    }

    private void limparCampos(){
        txtNomeCompleto.setText("");
        txtTelefone.setText("");
        txtEmail.setText("");
        txtCidade.setText("");
        ckIngressarListaEmail.setChecked(false);
        rdSexoMasculino.setChecked(false);
        rdSexoFeminino.setChecked(false);
    }

}