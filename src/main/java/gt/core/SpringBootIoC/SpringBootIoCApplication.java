package gt.core.SpringBootIoC;

import gt.core.SpringBootIoC.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootIoCApplication implements CommandLineRunner{

	private final ProductRepository productRepository;

    public SpringBootIoCApplication(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public static void main(String[] args) {
		SpringApplication.run(SpringBootIoCApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandGeneric() {
		return args -> {
			System.out.println("Hello, Spring Boot IoC, from commandGeneric!");
		};
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello, Spring Boot IoC!");
	}

	@Bean
	public CommandLineRunner commandUsingAutowired() {
		return args -> {
			productRepository.save("Remote Control");
			productRepository.remove("USB Mouse");
		};
	}
}