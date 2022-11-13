package edu.ciclo4.ms_seguridad.repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import edu.ciclo4.ms_seguridad.modelos.Permiso;

public interface RepoPermiso extends MongoRepository<Permiso, String>{
    
}

