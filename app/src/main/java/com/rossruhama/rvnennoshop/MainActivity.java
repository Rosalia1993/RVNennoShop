package com.rossruhama.rvnennoshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<PojoAnimales> animales;

    private RecyclerView listaAnimales;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaAnimales = (RecyclerView) findViewById(R.id.rvAnimales);

        //este  es como se muestran los datos
        LinearLayoutManager llm = new LinearLayoutManager(this);

        llm.setOrientation(LinearLayoutManager.VERTICAL);

        //este REcycler view se comporte como un linear layout
        listaAnimales.setLayoutManager(llm);

        inicializarListaAnimales();
        //inicializar el adaptador
    }

    public void inicializarAdaptador(){
        //crea un objeto de contacto adaptador

        AnimalesAdaptdor adaptador= new AnimalesAdaptdor(animales);
        listaAnimales.setAdapter(adaptador);
    }
    public void inicializarListaAnimales(){
        animales = new ArrayList<>();

        animales.add(new PojoAnimales("Mizzy",R.drawable.cupcake ));
        animales.add( new PojoAnimales("Nennin",R.drawable.lolipop));


        /*ArrayList nombresAnimales = new ArrayList<>();

       for(PojoAnimales animal: animales){
            nombresAnimales.add(animal.getNombre(),);

        }*/


    }
}
