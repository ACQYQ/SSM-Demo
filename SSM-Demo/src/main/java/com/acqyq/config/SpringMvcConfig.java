package com.acqyq.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan({"com.acqyq.controller","com.acqyq.config"})
@EnableWebMvc
public class SpringMvcConfig  {
}
