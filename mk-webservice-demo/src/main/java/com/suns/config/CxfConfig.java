package com.suns.config;

import com.suns.service.Demo2Service;
import com.suns.service.DemoService;
import com.suns.service.impl.Demo2ServiceImpl;
import com.suns.service.impl.DemoServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
public class CxfConfig {
 
    @Bean
    public ServletRegistrationBean disServlet() {
        return new ServletRegistrationBean(new CXFServlet(),"/demo/*");
    }
 
    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }
 
    @Bean
    public DemoService demoService() {
        return new DemoServiceImpl();
    }

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), demoService());
        endpoint.publish("/api");
        return endpoint;
    }


    // 一个接口一套 start
    @Bean
    public Demo2Service demo2Service() {
        return new Demo2ServiceImpl();
    }

    @Bean
    public Endpoint endpoint2() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), demo2Service());
        endpoint.publish("/api2");
        return endpoint;
    }
    // 一个接口一套 end

}