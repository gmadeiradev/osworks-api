package com.algaworks.osworks.core;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // configuration spring component
public class ModelMapperConfig {

	@Bean // indicates that the method initializes to be available for dependency injection
	public ModelMapper modelMapper() {
		
		return new ModelMapper();
	}
}
