package com.example.claytonandrade.cardview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.HashMap;

import interf.Endpoint;
import okhttp3.internal.Util;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

/**
 * Created by claytonandrade on 25/05/17.
 */

public class AcessoActivity extends AppCompatActivity {

    private Endpoint service;
    private Button buttonEntrar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acesso);

        Retrofit cliente = new Retrofit.Builder()
                .baseUrl("http://www.vagamaps.com.br/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        service = cliente.create(Endpoint.class);
        buttonEntrar = (Button)findViewById(R.id.btn_entrar);
        buttonEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HashMap<String, String> map = new HashMap<String, String>();
                map.put("email", "conteudo_edittext");
                map.put("senha","conteudo_senha");
                Call<Boolean> retornoEndpoint = service.buscarUsuario(map);
                retornoEndpoint.enqueue(new Callback<Boolean>() {
                    @Override
                    public void onResponse(Call<Boolean> call, Response<Boolean> response) {
                        if(response.body()!=null && response.body()){
                            Toast.makeText(AcessoActivity.this,"Existe Usuario",Toast.LENGTH_LONG).show();

                        }else{
                            Toast.makeText(AcessoActivity.this,"Não Existe Usuario",Toast.LENGTH_LONG).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<Boolean> call, Throwable t) {

                    }
                });
            }
        });

    }
}
