package com.example.demonative;

import com.example.demonativeexternal.DatasourceConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan
@Import(DatasourceConfiguration.class) // sem se davaji @Configuration classy
//@SpringBootApplication -> tohle v sobe schovava @Configuration @ComponentScan @EnableAutoConfiguration
public class DemonativeApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext
				= new AnnotationConfigApplicationContext(DemonativeApplication.class);

		System.out.println(applicationContext.getBean(MyRepository.class).getDataSource());
	}

}
