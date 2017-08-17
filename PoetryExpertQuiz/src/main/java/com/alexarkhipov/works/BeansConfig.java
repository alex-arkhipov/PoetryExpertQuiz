package com.alexarkhipov.works;

import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Bean
	public SessionFactory getSessionFactory() {
		SessionFactory sf = entityManagerFactory.unwrap(SessionFactory.class);
		if (sf == null) {
			throw new NullPointerException("factory is not a hibernate factory");
		}
		return sf;
	}
}
