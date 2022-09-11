package ejemplo.smoya.actividad13;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    // Creo la lista
    ArrayList<PersonajeVo> listaPersonajes;
    RecyclerView recyclerPersonajes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaPersonajes = new ArrayList<>();
        recyclerPersonajes = (RecyclerView) findViewById(R.id.rvLista);
        recyclerPersonajes.setLayoutManager(new LinearLayoutManager(this));

        llenarPersonajes(); // Metodo para alimentar nuestra lista

        AdaptadorPersonajes adaptador = new AdaptadorPersonajes(listaPersonajes);
        recyclerPersonajes.setAdapter(adaptador);

    }

    private void llenarPersonajes() {
        listaPersonajes.add(new PersonajeVo("Josepe","Hola", R.drawable.josepe));
        listaPersonajes.add(new PersonajeVo("Standly","Con solo 18 a Anuel AA.", R.drawable.standly));


    }

}