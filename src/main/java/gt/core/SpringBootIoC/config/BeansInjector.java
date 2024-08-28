package gt.core.SpringBootIoC.config;

import gt.core.SpringBootIoC.repository.ProductRepositoryA;
import gt.core.SpringBootIoC.repository.ProductRepositoryB;
import gt.core.SpringBootIoC.service.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansInjector {

    @Bean
    public ProductRepositoryA createProductRepositoryA() {
        return new ProductRepositoryA();
    }

    @Bean
    public ProductRepositoryB createProductRepositoryB() {
        return new ProductRepositoryB();
    }

    @Bean
    public ProductService createProductservice() {
        return new ProductService();
    }
}