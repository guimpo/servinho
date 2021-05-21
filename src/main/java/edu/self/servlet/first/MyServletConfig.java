package edu.self.servlet.first;


import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyServletConfig {

    @Bean
    public  ServletRegistrationBean<MyServlet> myServletBean() {
        return new ServletRegistrationBean<>(new MyServlet(), "/my-servlet/*");
    }

    @Bean
    public  ServletRegistrationBean<AnotherServlet> anotherServletBean() {
        return new ServletRegistrationBean<>(new AnotherServlet(), "/another-servlet/*");
    }
}
