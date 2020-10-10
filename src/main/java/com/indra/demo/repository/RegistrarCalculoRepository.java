package com.indra.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.indra.demo.model.RegistrarCalculo;


public interface RegistrarCalculoRepository extends JpaRepository<RegistrarCalculo, Integer>{

}
