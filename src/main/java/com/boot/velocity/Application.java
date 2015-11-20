/**
 * 
 */
package com.boot.velocity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 财宝
 *
 */

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.boot.velocity")
public class Application {

	public static void main(String[] args) {
		// 启动Spring Boot项目的唯一入口
		SpringApplication.run(Application.class, args);

	}

}
