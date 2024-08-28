package gt.core.SpringBootIoC;

import gt.core.SpringBootIoC.repository.ProductRepositoryA;
import gt.core.SpringBootIoC.repository.ProductRepositoryB;
import gt.core.SpringBootIoC.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootIoCApplication {

	@Autowired
	private ProductService productService;

    public static void main(String[] args) {
		SpringApplication.run(SpringBootIoCApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandUsingAutowired() {
		return args -> {
			productService.save("Teclado RGB");
			productService.remove("Auriculares basicos");
		};
	}
}