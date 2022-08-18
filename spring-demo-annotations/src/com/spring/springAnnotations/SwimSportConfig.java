package com.spring.springAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//need not enter componentScan
//@ComponentScan("com.spring.springAnnotations")
@PropertySource("classpath:mylogger.properties")
public class SwimSportConfig {
	
	//define bean for sadFortuneService
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	//define bean for swimCoach
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
	
	@Bean
	public LoggerConfig myLoggerConfig(@Value("${root.logger.level}") String rootLoggerLevel,
										 @Value("${printed.logger.level}") String printedLoggerLevel) {
 
		LoggerConfig loggerConfig = new LoggerConfig(rootLoggerLevel, printedLoggerLevel);
 
		return loggerConfig;
	}
}
