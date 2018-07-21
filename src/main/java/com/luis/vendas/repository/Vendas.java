package com.luis.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luis.vendas.model.Venda;

public interface Vendas extends JpaRepository<Venda, Long> {

}
