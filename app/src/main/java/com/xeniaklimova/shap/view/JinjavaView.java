package com.xeniaklimova.shap.view;

import com.hubspot.jinjava.Jinjava;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.jspecify.annotations.Nullable;
import org.springframework.web.servlet.View;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Scanner;

public class JinjavaView implements View {
    private final Jinjava jinjava;
    private final String templatePath;

    public JinjavaView(Jinjava jinjava, String templatePath) {
        this.jinjava = jinjava;
        this.templatePath = templatePath;
    }

    @Override
    public @Nullable String getContentType() {
        return "text/html";
    }

    @Override
    public void render(@Nullable Map<String, ?> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setContentType(getContentType());

        InputStream is = getClass().getResourceAsStream(templatePath);
        if (is == null) {
            throw new RuntimeException("Template not found: " + templatePath);
        }

        String template;
        try (Scanner scanner = new Scanner(is, StandardCharsets.UTF_8)) {
            template = scanner.useDelimiter("\\A").next();
        }

        String rendered = jinjava.render(template, (Map<String, Object>) model);
        response.getWriter().write(rendered);
    }
}
