package com.algaworks.algafood.api.model.input;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RestauranteIdInput {

    @NotNull
    private Long id;   
}        