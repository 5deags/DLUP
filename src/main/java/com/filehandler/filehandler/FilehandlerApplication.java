package com.filehandler.filehandler;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;


import java.util.Arrays;
//import java.util.Locale;

@SpringBootApplication
@EnableConfigurationProperties({
		FileStorageProps.class
})
public class FilehandlerApplication extends WebMvcConfigurerAdapter {

	public static void main(String[] args) {

		SpringApplication.run(FilehandlerApplication.class, args);


	}

	 //proovisin mitmekeelselt teha
	//@Bean
	//public LocaleResolver localeResolver() {
	//	SessionLocaleResolver slr = new SessionLocaleResolver();
	//	slr.setDefaultLocale(Locale.US);
	//	return slr;
	//}
////
	//@Bean
	//public LocaleChangeInterceptor localeChangeInterceptor() {
	//	LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
	//	lci.setParamName("lang");
	//	return lci;
	//}
//
	//@Override
	//public void addInterceptors(InterceptorRegistry registry) {
	//	registry.addInterceptor(localeChangeInterceptor());
	//}

}
