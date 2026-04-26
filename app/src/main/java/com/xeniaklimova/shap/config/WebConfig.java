package com.xeniaklimova.shap.config;

import com.hubspot.jinjava.Jinjava;
import com.xeniaklimova.shap.view.JinjavaViewResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.jdbc.config.annotation.web.http.EnableJdbcHttpSession;
import org.springframework.web.servlet.ViewResolver;

@Configuration
@EnableJdbcHttpSession
public class WebConfig {

    @Bean
    public Jinjava jinjava() {
        return new Jinjava();
    }

    @Bean
    public ViewResolver jinjavaViewResolver(Jinjava jinjava) {
        return new JinjavaViewResolver(jinjava);
    }
}
