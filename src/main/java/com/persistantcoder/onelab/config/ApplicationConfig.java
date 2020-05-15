package com.persistantcoder.onelab.config;

import com.persistantcoder.onelab.converters.StringToEnumConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.format.FormatterRegistry;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by Evans K F C on May ,2020
 **/

@Configuration
@ComponentScan("com.persistantcoder.onelab")
public class ApplicationConfig extends WebMvcConfigurationSupport {


    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("css/**", "images/**")
                .addResourceLocations("classpath:/static/css/","classpath:/static/images/");

    }


    @Bean
    public InternalResourceViewResolver jspViewResolver(){

        InternalResourceViewResolver viewResolver  = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/jsp/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setViewClass(JstlView.class);

        return viewResolver;
    }


    @Override
    protected void configureAsyncSupport(AsyncSupportConfigurer configurer) {
        configurer.setDefaultTimeout(5000);
        configurer.setTaskExecutor(asyncTaskExecutor());
    }

    @Bean
    public AsyncTaskExecutor asyncTaskExecutor(){
        ThreadPoolTaskExecutor threadPoolExecutor = new ThreadPoolTaskExecutor();
        threadPoolExecutor.setThreadNamePrefix("onelab-thread");
        return threadPoolExecutor;


    }

    @Override
    protected void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new StringToEnumConverter());

    }
}
