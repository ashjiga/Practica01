package com.practica01.service.impl;

import com.practica01.dao.ArbolDao;
import com.practica01.domain.Arbol;
import com.practica01.service.ArbolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ArbolServiceImpl implements ArbolService {

    @Autowired
    private ArbolDao arbolDao;

    @Override
    public List<Arbol> getArboles() {
        return (List<Arbol>) arbolDao.findAll();
    }

    @Override
    public void guardar(Arbol arbol) {
        arbolDao.save(arbol);
    }

    @Override
    public void eliminar(Arbol arbol) {
        arbolDao.delete(arbol);
    }

    @Override
    public Arbol encontrarArbol(Arbol arbol) {
        return arbolDao.findById(arbol.getIdArbol()).orElse(null);
    }
}
