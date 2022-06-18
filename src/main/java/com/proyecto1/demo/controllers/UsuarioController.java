package com.proyecto1.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

//import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto1.demo.models.UsuarioModel;
import com.proyecto1.demo.services.UsuarioServices;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioServices usuarioServices;

    @GetMapping()
    public ResponseEntity <ArrayList<UsuarioModel>> obtenerUsuarios() {
        return  new ResponseEntity<ArrayList<UsuarioModel>>(usuarioServices.obtenerUsuarios(), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<UsuarioModel> guardarUsuario(@RequestBody UsuarioModel usuario) {
        return new ResponseEntity<>(this.usuarioServices.guardarUsuario(usuario),HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<UsuarioModel>> obtenerUsuarioPorId(@PathVariable("id") long id) {
        return new ResponseEntity<>(this.usuarioServices.obtenerPorId(id),HttpStatus.OK);
        
    }

    /*@GetMapping("/query")
    public ArrayList<UsuarioModel> obtenerUsuarioPorTelefono(@RequestParam("telefono") Integer tel) {
        return this.usuarioServices.obtenerPortelefono(tel);
    }*/ 
    @GetMapping("/query")
    public ResponseEntity<ArrayList<UsuarioModel>> obtenerUsuarioPorDocumento(@RequestParam("documento") Integer cedula) {
        return  new ResponseEntity<ArrayList<UsuarioModel>>(this.usuarioServices.obtenerPordocumento(cedula), HttpStatus.OK);
    }
    
}