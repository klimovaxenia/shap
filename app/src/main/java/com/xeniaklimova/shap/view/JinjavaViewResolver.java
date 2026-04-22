package com.xeniaklimova.shap.view;

import com.hubspot.jinjava.Jinjava;
import org.jspecify.annotations.Nullable;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

public class JinjavaViewResolver implements ViewResolver {
    private final Jinjava jinjava;

    public JinjavaViewResolver(Jinjava jinjava) {
        this.jinjava = jinjava;
    }
    @Override
    public @Nullable View resolveViewName(String viewName, Locale locale) throws Exception {
        String path = "/templates/" + viewName + ".jinja";
        return new JinjavaView(jinjava, path);
    }
}
