package restservice.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import controller.ContainerClass;
import service.JsonFetchImpl;

@SpringBootApplication
@ComponentScan(basePackageClasses={ContainerClass.class,JsonFetchImpl.class})
public class RestserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestserviceApplication.class, args);
	}

}

