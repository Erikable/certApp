package com.erk.able.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMvcDispatcherSerlvetIntitializer extends AbstractAnnotationConfigDispatcherServletInitializer {


    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {SpringConfig.class}; // add our class
        //теперь данный класс выполняющий роль веб.хмл знает где спринг конфигурация
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"}; // все запросы от пользака шлем на диспатчерСервлет
    }
}
