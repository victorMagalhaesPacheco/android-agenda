package com.example.victor.agenda;

import android.widget.EditText;
import android.widget.RatingBar;

import com.example.victor.agenda.modelo.Aluno;

/**
 * Created by victor on 05/12/16.
 */

public class FormularioHelper {

    private EditText campoNome;
    private EditText campoEndereco;
    private EditText campoTelefone;
    private EditText campoSite;
    private RatingBar campoNota;

    public FormularioHelper(FormularioActivity activity) {

        this.campoNome = (EditText) activity.findViewById(R.id.formulario_nome);
        this.campoEndereco = (EditText) activity.findViewById(R.id.formulario_endereco);
        this.campoTelefone = (EditText) activity.findViewById(R.id.formulario_telefone);
        this.campoSite = (EditText) activity.findViewById(R.id.formulario_site);
        this.campoNota = (RatingBar) activity.findViewById(R.id.formulario_nota);

    }

    public Aluno pegaAluno() {
        Aluno aluno = new Aluno();
        aluno.setNome(this.campoNome.getText().toString());
        aluno.setEndereco(this.campoEndereco.getText().toString());
        aluno.setTelefone(this.campoTelefone.getText().toString());
        aluno.setSite(this.campoSite.getText().toString());
        aluno.setNota(Double.valueOf(this.campoNota.getProgress()));

        return aluno;
    }
}
