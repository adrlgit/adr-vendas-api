package com.luis.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luis.vendas.model.Produto;

public interface Produtos extends JpaRepository<Produto, Long> {

}
