package com.spring.spa.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import lombok.RequiredArgsConstructor;


@Configuration
@RequiredArgsConstructor
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {

	public void addViewControllers(ViewControllerRegistry registry) {
		// /로 접속시 index.jsp 로 이동 
		registry.addViewController("/").setViewName("forward:/index.jsp");
	}

	/*ResourceHandlers 설정  들어오는 정적 파일 위치를 설정한다. **/
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		//classpath REPOSITORY 를 선언함
		//  /**/ 경우 /path1/path2/path3/item.html 을 모두 포함시킴 
		registry.addResourceHandler("/**/*.html").addResourceLocations("classpath:/static/html/");
		registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
	}

	
}
