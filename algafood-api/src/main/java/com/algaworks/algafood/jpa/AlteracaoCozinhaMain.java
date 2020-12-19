package com.algaworks.algafood.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.infrastructure.repository.CozinhaRepositoryImpl;

public class AlteracaoCozinhaMain {

		public static void main(String[] args) {
			
			ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
					.web(WebApplicationType.NONE)
					.run(args);
			
			CozinhaRepositoryImpl cozinhaRepositoryImpl = applicationContext.getBean(CozinhaRepositoryImpl.class);
			
			Cozinha cozinha = new Cozinha();
			
			cozinha.setId(1L);
			cozinha.setNome("Brasileira");
			
			cozinhaRepositoryImpl.salvar(cozinha);
		}
}
