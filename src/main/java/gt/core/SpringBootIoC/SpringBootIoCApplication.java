package gt.core.SpringBootIoC;

import gt.core.SpringBootIoC.repository.ProductRepositoryA;
import gt.core.SpringBootIoC.repository.ProductRepositoryB;
import gt.core.SpringBootIoC.service.ProductService;
import gt.core.SpringBootIoC.service.ShoppingCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class SpringBootIoCApplication {


	private ProductService productService;

	@Autowired
	private ShoppingCarService shoppingCarService;


//	public SpringBootIoCApplication(ProductService productService) {
//		this.productService = productService;
//	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootIoCApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner commandUsingAutowired() {
//		return args -> {
//			productService.save("Teclado RGB");
//			productService.remove("Auriculares basicos");
//
//		};
//	}

	@Autowired
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	@RequestMapping("/example")
	public String example() {
		productService.save("Teclado RGB");
		return "Hola Spring Boot IoC";
	}

	@RequestMapping("/add-product")
	public String addProduct() {
		shoppingCarService.add();
		return "Producto agregado";
	}

	@RequestMapping("/get-products")
	public List<String> getProducts() {
		return shoppingCarService.get();
	}
}