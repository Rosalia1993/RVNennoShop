package com.rossruhama.rvnennoshop;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class AnimalesAdaptdor extends RecyclerView.Adapter<AnimalesAdaptdor.AnimalViewHolder>{
    ArrayList<PojoAnimales> animales;

    public AnimalesAdaptdor(ArrayList<PojoAnimales> animales){
        this.animales= animales;
    }


    @NonNull
    @Override //maneja el inflate, darle vida al cardiew
    public AnimalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.carview_mascota,parent);
        return  new AnimalViewHolder(v);
    }

    @Override
    public void onBindViewHolder( AnimalViewHolder animalViewHolder, int position) {
        //aqui se va a aestar pasando a cada elementos que esta asiendfifu
        PojoAnimales animal = animales.get(position);
        animalViewHolder.imgFoto.setImageResource(animal.getFotoPerfil());  //seteo de la foto en el objeton en el que va
        animalViewHolder.tvNombreCV.setText(animal.getNombre());
        //animalViewHolder.imgbtnLike.setImageResource(animal.getFotoPerfil());
    }

    @Override
    public int getItemCount() {// tamaño de la lista
        return animales.size();
    }

    public static class AnimalViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgFoto;
      //  private ImageButton imgbtnLike;
        private TextView   tvNombreCV;
        // private RatingBar ratingStar;


        public AnimalViewHolder( View itemView) {
            super(itemView);
            imgFoto = (ImageView) itemView.findViewById(R.id.imgFotoPerfil);
          // imgbtnLike =(ImageButton) itemView.findViewById(R.id.imgHuecito);
           tvNombreCV = (TextView) itemView.findViewById(R.id.tvNombreCV);
           //ratingStar = (RatingBar) itemView.findViewById(R.id.rating);

        }
    }
}
