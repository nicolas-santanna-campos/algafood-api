package com.algaworks.algafood.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.AlgafoodApiApplication;

public class ExclusaoCozinhaMain {

		public static void main(String[] args) {
			
			ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
					.web(WebApplicationType.NONE)
					.run(args);
			
		//	CozinhaRepositoryImpl cozinhaRepositoryImpl = applicationContext.getBean(CozinhaRepositoryImpl.class);
			
		//	Cozinha cozinha = new Cozinha();
		//	cozinha.setId(1L);
						
		//	cozinhaRepositoryImpl.remover(1L);
	}
}
