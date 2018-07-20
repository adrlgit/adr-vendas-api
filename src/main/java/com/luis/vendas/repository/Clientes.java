package com.luis.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luis.vendas.model.Cliente;

public interface Clientes extends JpaRepository<Cliente, Long> {

}
