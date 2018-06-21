package com.example.claytonandrade.cardview;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by claytonandrade on 18/05/17.
 */

public class ContatoCard extends RecyclerView.Adapter<ContatoCard.ViewHolder> {

    private List<Pessoa> io_pessoa;
    private Activity io_acActivity;

    public ContatoCard(final Activity io_activity){
        this.io_acActivity = io_activity;

        io_pessoa = new ArrayList<Pessoa>();
        io_pessoa.add(new Pessoa("Clayton Andrade", "30 Anos", R.drawable.ic_insert_photo_black_24dp));
        io_pessoa.add(new Pessoa("Michele Andrade", "28 Anos", R.drawable.ic_insert_photo_black_24dp));
        io_pessoa.add(new Pessoa("Ana Julia Andrade", "11 Anos", R.drawable.ic_insert_photo_black_24dp));
        io_pessoa.add(new Pessoa("Ana Lara Andrade", "9 Anos", R.drawable.ic_insert_photo_black_24dp));
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_contato,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Pessoa pessoa = io_pessoa.get(position);
        holder.pessoa_foto.setImageDrawable(io_acActivity.getResources().getDrawable(pessoa.getFoto_pessoa()));
        holder.pessoa_nome.setText(pessoa.getNome_pessoa());
        holder.pessoa_idade.setText(""+pessoa.getIdade_pessoa());

    }

    @Override
    public int getItemCount() {
        return io_pessoa.size();
    }

    class  ViewHolder extends RecyclerView.ViewHolder{

        ImageView pessoa_foto;
        TextView pessoa_nome;
        TextView pessoa_idade;

        public ViewHolder(View itemView) {
            super(itemView);

            pessoa_foto = (ImageView)itemView.findViewById(R.id.contato_foto);
            pessoa_nome = (TextView)itemView.findViewById(R.id.contato_nome);
            pessoa_idade = (TextView)itemView.findViewById(R.id.contato_idade);
        }
    }
}
