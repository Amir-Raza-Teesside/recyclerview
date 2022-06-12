package uk.ac.tees.aad.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import uk.ac.tees.aad.recyclerview.Adapter.MyAdapter;
import uk.ac.tees.aad.recyclerview.Model.Model;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Model> info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        info = new ArrayList<>();
        info.add(new Model("Pakisran","sdsd",R.drawable.ic_launcher_background));
        info.add(new Model("Pakisran","sdsd",R.drawable.ic_launcher_background));
        info.add(new Model("Pakisran","sdsd",R.drawable.ic_launcher_background));
        info.add(new Model("Pakisran","sdsd",R.drawable.ic_launcher_background));
        info.add(new Model("Pakisran","sdsd",R.drawable.ic_launcher_background));
        info.add(new Model("Pakisran","sdsd",R.drawable.ic_launcher_background));
        info.add(new Model("Pakisran","sdsd",R.drawable.ic_launcher_background));
        info.add(new Model("Pakisran","sdsd",R.drawable.ic_launcher_background));
        info.add(new Model("Pakisran","sdsd",R.drawable.ic_launcher_background));
        info.add(new Model("Pakisran","sdsd",R.drawable.ic_launcher_background));
        info.add(new Model("Pakisran","sdsd",R.drawable.ic_launcher_background));
        info.add(new Model("Pakisran","sdsd",R.drawable.ic_launcher_background));

        recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter adapter = new MyAdapter(info, MainActivity.this);
        recyclerView.setAdapter(adapter);
    }
}