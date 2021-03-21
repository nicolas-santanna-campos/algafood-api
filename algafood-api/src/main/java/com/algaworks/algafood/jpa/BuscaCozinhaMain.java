package com.algaworks.algafood.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.AlgafoodApiApplication;



public class BuscaCozinhaMain {

		public static void main(String[] args) {
			
			ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
					.web(WebApplicationType.NONE)
					.run(args);
			
	//		CozinhaRepositoryImpl cozinhaRepositoryImpl = applicationContext.getBean(CozinhaRepositoryImpl.class);
			
			//BUSCAR
	//		Cozinha cozinha = cozinhaRepositoryImpl.buscar(1L);
			
	//		System.out.println(cozinha.getNome());
		}
}
