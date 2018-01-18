package com.x.proc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// Spring Boot 应用的标识
@SpringBootApplication
// mapper 接口类扫描包配置
@MapperScan("com.x.proc.dao")
public class Application {

	// 程序启动入口
	// 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
