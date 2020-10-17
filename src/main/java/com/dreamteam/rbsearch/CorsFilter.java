package com.dreamteam.rbsearch;

import lombok.extern.slf4j.Slf4j;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

@Component
@Slf4j
public class CorsFilter implements Filter {


    @Override
    public void doFilter(ServletRequest req,
                         ServletResponse res,
                         FilterChain chain) throws IOException, ServletException {

        HttpServletResponse response = (HttpServletResponse) res;
        HttpServletRequest request = (HttpServletRequest) req;
        log.info("Detected request: {}: {}", request.getMethod(), request.getRequestURL());
        var headers = getHeaders();

        headers.keySet().forEach(header -> {
            try {
                var aMethod = response.getClass()
                        .getMethod("setHeader", String.class, String.class);
                aMethod.invoke(response, header, headers.get(header));
            } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                log.error("Error while parsing CORS headers");
            }
        });

        chain.doFilter(req, res);
    }

    @Override
    public void init(FilterConfig filterConfig) {
        log.info("CORS filter initialized");
    }


    private Map<String, String> getHeaders() {
        var headers = new HashMap<String, String>();
        headers.put(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "*");
        headers.put(HttpHeaders.ACCESS_CONTROL_ALLOW_METHODS, "GET, POST, DELETE, PUT, PATCH, OPTIONS");
        headers.put(HttpHeaders.ACCESS_CONTROL_MAX_AGE, "3600");
        headers.put(HttpHeaders.ACCESS_CONTROL_ALLOW_HEADERS, "*");
        return headers;
    }
}