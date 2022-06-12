package uk.ac.tees.aad.recyclerview.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import uk.ac.tees.aad.recyclerview.Model.Model;
import uk.ac.tees.aad.recyclerview.R;
import uk.ac.tees.aad.recyclerview.ViewHodler.MyViewholder;

public class MyAdapter extends RecyclerView.Adapter<MyViewholder> {

    ArrayList<Model> Information;
    Context context;

    public MyAdapter(ArrayList<Model> information, Context context) {
        Information = information;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.singlerow,parent,false);

        return new MyViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewholder holder, int position) {
        holder.textView1.setText(Information.get(position).getCountryName());
        holder.textView2.setText(Information.get(position).getCountrDescription());
        holder.imageView.setImageResource(Information.get(position).getCountrFlag());

    }

    @Override
    public int getItemCount() {
        return Information.size();
    }
}
