package com.proyecto1.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto1.demo.models.UsuarioModel;
import com.proyecto1.demo.repositories.UsuarioRepositories;

@Service
public class UsuarioServices {
    @Autowired
    UsuarioRepositories usuarioRepositories;

    public ArrayList<UsuarioModel> obtenerUsuarios() {
        return (ArrayList<UsuarioModel>) usuarioRepositories.findAll();
    }

    public UsuarioModel guardarUsuario(UsuarioModel usuario) {
        return usuarioRepositories.save(usuario);
    }

    public Optional<UsuarioModel> obtenerPorId(long id) {
        return usuarioRepositories.findById(id);
    }

    /*public ArrayList<UsuarioModel> obtenerPortelefono(Integer telefono) {
        return usuarioRepositories.findBytelefono(telefono);
        }*/
    public ArrayList<UsuarioModel> obtenerPordocumento(Integer documento) {
         return usuarioRepositories.findBydocumento(documento);
         }

        }