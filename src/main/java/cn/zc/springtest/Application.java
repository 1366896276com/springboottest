package cn.zc.springtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * 
 * @author zero 方式1：路由和main方法在同一类中 方式2,方式3：路由和main方法分开编写
 */
// 方式1
// @RestController
// @EnableAutoConfiguration

// 方式2
// @Controller
// @EnableWebMvc
/**
 * The @SpringBootApplication annotation is equivalent to
 * using @Configuration, @EnableAutoConfiguration and @ComponentScan with their
 * default attributes:
 */
// @SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan

// 方式3
@Configuration
@EnableAutoConfiguration
/**
 * we often find that using @ComponentScan to find your beans, in combination
 * with @Autowired constructor injection works wel
 *
 */
@ComponentScan
public class Application {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}

	// 方式1
	// @RequestMapping("/")
	// String home() {
	// return "Hello World!";
	// }
}
