package com.pucgoias.ex23.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pucgoias.ex23.R;
import com.pucgoias.ex23.User;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
     Context context;
     List<User> users;

    public UserAdapter(Context context, List<User> users) {
        this.context = context;
        this.users = users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
        notifyDataSetChanged();
    }

    /**
     *
     * @param parent - é o componente do tipo View a ser carregado dentro do RecyclerView
     * @param viewType - é o viewType.
     * @return - retorna um objeto do tipo ViewHolder
     */
    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.one_user_element, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    /**
     *
     * @param holder - é o objeto da classe ViewHolder, responsável por manipular cada unidade disponível no RecyclerView.
     * @param position - é a posição obtida na estrutura de dados que contém os dados a serem manipulados no viewHolder.
     */
    @Override
    public void onBindViewHolder(@NonNull @NotNull UserAdapter.ViewHolder holder, int position) {


    }

    /**
     *
     * @return  - retorna a quantidade de itens carregados no RecyclerView
     */

    @Override
    public int getItemCount() {
        if(users != null){
            return users.size();
        }
        return 0;
    }

    /**
     * classe responsável por ser o modelo de cada item individual do RecyclerView.
     */
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        TextView email;
        TextView telephone;
        TextView url;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

        }
    }
}