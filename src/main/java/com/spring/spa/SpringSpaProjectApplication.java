package com.spring.spa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
/*@EnableAspectJAutoProxy 는 AOP 기능 활성화 
 * 없으면 트랜잭션이 발동하지 않음 */
@EnableAspectJAutoProxy(exposeProxy = true)
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SpringSpaProjectApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringSpaProjectApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringSpaProjectApplication.class);
	}

}
