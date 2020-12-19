package com.algaworks.algafood.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.Restaurante;
import com.algaworks.algafood.infrastructure.repository.RestauranteRepositoryImpl;

public class InclusaoRestauranteMain {
	
		public static void main(String[] args) {
			
			ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
					.web(WebApplicationType.NONE)
					.run(args);
			
			RestauranteRepositoryImpl restauranteRepositoryImpl = applicationContext.getBean(RestauranteRepositoryImpl.class);
			
			//INSERIR
			Restaurante restaurante1 = new Restaurante();
			restaurante1.setNome("Brasileira"); 
			

			Restaurante restaurante2 = new Restaurante();
			restaurante2.setNome("Japonesa"); 
			
			restaurante1 = restauranteRepositoryImpl.salvar(restaurante1);
			restaurante2 = restauranteRepositoryImpl.salvar(restaurante2);
			
			System.out.printf("%d - %s\n", restaurante1.getId(), restaurante1.getNome());
			System.out.printf("%d - %s\n", restaurante2.getId(), restaurante2.getNome());
		}
}
