package com.redsocial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.redsocial.entity.Editorial;

public interface EditorialRepository extends JpaRepository<Editorial, Integer> {

	@Query("Select e from Editorial e where e.nombre like :var_fil")
	public List<Editorial> listaPorNombre(@Param("var_fil") String filtro);
	
	
}
