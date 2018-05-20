/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.go.ToGo.Repositories;

import com.example.go.ToGo.Entities.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author Usuario
 */
//@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UsuarioRepository extends JpaRepository<Usuario, Long> /*PagingAndSortingRepository<Usuario, Long>*/ {

    List<Usuario> findByNombre(@Param("Nombre") String name);

    Usuario findByEmail(@Param("Email") String email);
}
