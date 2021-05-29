package com.kodilla.converter.controler;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;

@Configuration
public class KeyValueConverterConfiguration {

    @Bean
    public HttpMessageConverter<Object> customKeyValueConverter() {
        return new KeyValueConverter();
    }

}