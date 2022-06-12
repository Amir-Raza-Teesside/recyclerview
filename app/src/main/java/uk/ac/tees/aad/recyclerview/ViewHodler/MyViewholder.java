package uk.ac.tees.aad.recyclerview.ViewHodler;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import uk.ac.tees.aad.recyclerview.R;

public class MyViewholder extends RecyclerView.ViewHolder
{
   public ImageView imageView;
   public TextView textView1,textView2;
    public MyViewholder(@NonNull View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.imageView);
        textView1 = itemView.findViewById(R.id.textView4);
        textView2 = itemView.findViewById(R.id.textView5);


    }
}
