package com.algaworks.algafood.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.Restaurante;
import com.algaworks.algafood.infrastructure.repository.RestauranteRepositoryImpl;



public class BuscaRestauranteMain {

		public static void main(String[] args) {
			
			ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
					.web(WebApplicationType.NONE)
					.run(args);
			
			RestauranteRepositoryImpl restauranteRepositoryImpl = applicationContext.getBean(RestauranteRepositoryImpl.class);
			
			//BUSCAR
			Restaurante restaurante = restauranteRepositoryImpl.buscar(1L);
			
			System.out.println(restaurante.getNome());
		}
}
