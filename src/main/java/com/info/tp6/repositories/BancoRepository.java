package com.info.tp6.repositories;


import java.util.List;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;


import com.info.tp6.model.Banco;

@Repository
public interface BancoRepository extends CrudRepository<Banco,Long> {	
	    
	    public Banco findByNombre(String nombre);
	    public List<Banco> findByAll();
	    public Banco findById(String id_banco);

}
