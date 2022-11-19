package edu.ciclo4.ms_seguridad.repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import edu.ciclo4.ms_seguridad.modelos.Permiso;

public interface RepoPermiso extends MongoRepository<Permiso, String>{
    @Query("{'url':?0,'metodo':?1}")
    Permiso getPermiso(String url, String metodo);
}