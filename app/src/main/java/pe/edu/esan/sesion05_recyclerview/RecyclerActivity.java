package pe.edu.esan.sesion05_recyclerview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends Activity {
    RecyclerView rvLista;
    List<Persona> listaPersonas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        rvLista = (RecyclerView) findViewById(R.id.rvLista);

        LinearLayoutManager lm = new LinearLayoutManager(this);
        rvLista.setLayoutManager(lm);
        rvLista.setHasFixedSize(true);

        this.CargarData();
        this.CargarAdapter();
    }

    private void CargarData() {
        listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Jefferson Farfan", "34 años",  R.drawable.farfan));
        listaPersonas.add(new Persona("Paolo Guerrero", "35 años",  R.drawable.guerrero));
        listaPersonas.add(new Persona("Edison Flores", "24 años",  R.drawable.flores));
    }

    private void CargarAdapter() {
        RVAdapter adapter = new RVAdapter(listaPersonas);
        rvLista.setAdapter(adapter);
    }

}
