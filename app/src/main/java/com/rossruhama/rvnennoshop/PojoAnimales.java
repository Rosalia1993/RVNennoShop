package com.rossruhama.rvnennoshop;

public class PojoAnimales {

    private String nombre;
    private int fotoPerfil;
    private int raking;



    public PojoAnimales(String nombre, int foto) {
        this.nombre = nombre;
        this.fotoPerfil = foto;
    }



    public int getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(int fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public int getRaking() {
        return raking;
    }

    public void setRaking(int raking) {
        this.raking = raking;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }





}
