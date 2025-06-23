package com.practica01.service;

import com.practica01.domain.Arbol;
import java.util.List;

public interface ArbolService {
    List<Arbol> getArboles();
    void guardar(Arbol arbol);
    void eliminar(Arbol arbol);
    Arbol encontrarArbol(Arbol arbol);
}