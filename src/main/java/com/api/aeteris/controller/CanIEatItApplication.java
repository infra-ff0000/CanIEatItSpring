package com.api.aeteris.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;


/**
 *
 * @author ariazavocki
 */
//@SpringBootApplication
@SpringBootApplication
@PropertySources({
//	@PropertySource({ PropertyConstant.PROPERTY_FILE })
	@PropertySource(ignoreResourceNotFound=true,value="classpath:application.properties")
})
@ComponentScan(basePackages ={"com"})
//@EnableAutoConfiguration(exclude = HibernateJpaAutoConfiguration.class)
public class CanIEatItApplication {

	public static void main(String[] args) {
		SpringApplication.run(CanIEatItApplication.class, args);
	}
}
