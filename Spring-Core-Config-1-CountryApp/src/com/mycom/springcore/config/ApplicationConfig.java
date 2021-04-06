package com.mycom.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mycom.springcore.config.beans.Country;
@Configuration
public class ApplicationConfig {
	@Bean(name="country")
	//like         <bean id="country" class="Country">
	//              <property name="countryName" value="India">
	//              
public Country getCountry() {
	return new Country("India");
}
}
