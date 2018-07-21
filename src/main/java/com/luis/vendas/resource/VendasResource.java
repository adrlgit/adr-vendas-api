package com.luis.vendas.resource;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luis.vendas.model.Venda;
import com.luis.vendas.repository.Vendas;

@RestController
@RequestMapping("/vendas")
public class VendasResource {

	private Vendas vendas;
	
	public List<Venda> listar(){
		return vendas.findAll();
	}
}
