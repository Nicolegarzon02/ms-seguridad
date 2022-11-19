package edu.ciclo4.ms_seguridad.repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;


import edu.ciclo4.ms_seguridad.modelos.Usuario;
public interface RepoUsuario extends MongoRepository <Usuario, String>{
    
    public Usuario getUserByEmail(String email);
}