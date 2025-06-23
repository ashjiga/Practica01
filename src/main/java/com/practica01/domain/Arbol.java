package com.practica01.domain;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "arbol")
public class Arbol implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_arbol")
    private Long idArbol;

    @Column(name = "nombre_comun")
    private String nombreComun;

    @Column(name = "tipo_flor")
    private String tipoFlor;

    @Column(name = "dureza_madera")
    private int durezaMadera;

    @Column(name = "ruta_imagen")
    private String rutaImagen;

    public Arbol() {}

    public Arbol(String nombreComun, String tipoFlor, int durezaMadera, String rutaImagen) {
        this.nombreComun = nombreComun;
        this.tipoFlor = tipoFlor;
        this.durezaMadera = durezaMadera;
        this.rutaImagen = rutaImagen;
    }

    public Long getIdArbol() {
        return idArbol;
    }

    public void setIdArbol(Long idArbol) {
        this.idArbol = idArbol;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public String getTipoFlor() {
        return tipoFlor;
    }

    public void setTipoFlor(String tipoFlor) {
        this.tipoFlor = tipoFlor;
    }

    public int getDurezaMadera() {
        return durezaMadera;
    }

    public void setDurezaMadera(int durezaMadera) {
        this.durezaMadera = durezaMadera;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }
}