package com.catata.spinnerasynctask.model;

import com.catata.spinnerasynctask.model.Ubicacion;

public class Localidad extends Ubicacion {
    int provincia;

    public Localidad(int id, String descripcion, int provincia) {
        super(id, descripcion);
        this.provincia = provincia;
    }

    public Localidad(int id, String descripcion) {
        super(id, descripcion);
    }

    public int getProvincia() {
        return provincia;
    }

    public void setProvincia(int provincia) {
        this.provincia = provincia;
    }
}
