package com.proyecto1.demo.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto1.demo.models.UsuarioModel;

@Repository
public interface UsuarioRepositories extends CrudRepository<UsuarioModel, Long> {
    //public abstract ArrayList<UsuarioModel> findBytelefono(Integer telefono);
    public abstract ArrayList<UsuarioModel> findBydocumento(Integer documento);
}
