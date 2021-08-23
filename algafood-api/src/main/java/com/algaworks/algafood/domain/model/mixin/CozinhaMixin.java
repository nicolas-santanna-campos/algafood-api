package com.algaworks.algafood.domain.model.mixin;

import java.util.ArrayList;
import java.util.List;

import com.algaworks.algafood.domain.model.Restaurante;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class CozinhaMixin {
	
  	@JsonProperty(value = "titulo")
	private String nome;
	
	@JsonIgnore
	private List<Restaurante> restaurantes = new ArrayList<>();
}
