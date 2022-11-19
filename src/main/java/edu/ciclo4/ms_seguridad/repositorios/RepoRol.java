package edu.ciclo4.ms_seguridad.repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.ciclo4.ms_seguridad.modelos.Rol;


public interface RepoRol extends MongoRepository <Rol, String> {

    
}