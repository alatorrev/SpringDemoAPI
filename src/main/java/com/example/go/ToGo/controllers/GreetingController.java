/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.go.ToGo.controllers;

import com.example.go.ToGo.Entities.Usuario;
import com.example.go.ToGo.Repositories.UsuarioRepository;
import java.awt.PageAttributes;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Usuario
 */
@RestController
@RequestMapping("/api")
public class GreetingController {

    @Autowired
    UsuarioRepository usuarioRepo;

    @GetMapping(value = "/greeting", produces = "application/json")
    public List<String> SayHello() {
        List<String> helloList = new ArrayList<>();
        helloList.add("aaaaaaaaaa");
        helloList.add("bbbbbbbbbb");
        return helloList;
    }

    @GetMapping(value = "/usuarios", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Usuario> getAllUsuarios() {
        return usuarioRepo.findAll();
    }

}
