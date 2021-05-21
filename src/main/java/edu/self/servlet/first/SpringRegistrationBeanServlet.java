package edu.self.servlet.first;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringRegistrationBeanServlet {

    @Bean
    public ServletRegistrationBean<EEWebXmlServlet> genericCustomServlet() {
        ServletRegistrationBean<EEWebXmlServlet> bean = new ServletRegistrationBean<>(new EEWebXmlServlet(), "/test/*");
        bean.setLoadOnStartup(1);
        return bean;
    }
}
