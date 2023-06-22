package com.example.projetonavigationdrawer.ui.cadastro;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.projetonavigationdrawer.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ValidaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ValidaFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ValidaFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ValidaFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ValidaFragment newInstance(String param1, String param2) {
        ValidaFragment fragment = new ValidaFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_valida, container, false);
    }


    /*public void onClick(View view) {
        Intent intent = new Intent(getActivity(), CadastroFragment.class);
        startActivity(intent);


        String matricula = onClick(CadastroFragment.MATRICULA);
        TextView textViewMatricula = R.id.matricula;
        textViewMatricula.setText(matricula);


        String nome = onClick(CadastroFragment.NOME);
        TextView textViewNome = R.id.nome;
        textViewNome.setText(nome);


        String sobrenome = onClick(CadastroFragment.SOBRENOME);
        TextView textViewSobrenome = R.id.sobrenome;
        textViewSobrenome.setText(sobrenome);

        String sexo = onClick(CadastroFragment.SEXO);
        TextView textViewSexo = R.id.sexo;
        textViewSexo.setText(sexo);

        String curso = onClick(CadastroFragment.CURSO);
        TextView textViewCurso = R.id.curso;
        textViewCurso.setText(curso);

        String celular = onClick(CadastroFragment.CELULAR);
        TextView textViewCelular = R.id.celular;
        textViewCelular.setText(celular);

        String email = onClick(CadastroFragment.EMAIL);
        TextView textViewEmail = R.id.email;
        textViewEmail.setText(email);

        String bandeira = onClick(CadastroFragment.BANDEIRA);
        TextView textViewBandeira = R.id.sexo;
        textViewBandeira.setText(bandeira);

        String numerocartao = onClick(CadastroFragment.NUMEROCARTAO);
        TextView textViewNumeroCartao = R.id.numerocartao;
        textViewNumeroCartao.setText(numerocartao);

        String nometitular = onClick(CadastroFragment.NOMETITULAR);
        TextView textViewNomeTitular = R.id.nometitular;
        textViewNomeTitular.setText(nometitular);

        String datavalidade = onClick(CadastroFragment.DATAVALIDADE);
        TextView textViewDataValidade = R.id.datavalidade;
        textViewDataValidade.setText(datavalidade);

        String cvv = onClick(CadastroFragment.CVV);
        TextView textViewCVV = R.id.cvv;
        textViewCVV.setText(cvv);

        View buttonConfirmar = R.id.buttonConfirmar;
        buttonConfirmar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText("Dados Corretos!", Toast.LENGTH_LONG).show();
            }
        });
    }
        */
}
