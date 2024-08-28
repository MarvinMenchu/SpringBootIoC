package gt.core.SpringBootIoC.config;

import gt.core.SpringBootIoC.repository.ProductRepositoryA;
import gt.core.SpringBootIoC.repository.ProductRepositoryB;
import gt.core.SpringBootIoC.service.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeansInjector {

    @Bean("productXMLRepository")
    @Primary
    public ProductRepositoryA createProductRepositoryA() {
        return new ProductRepositoryA();
    }

    @Bean("productMySQLRepository")
    public ProductRepositoryB createProductRepositoryB() {
        return new ProductRepositoryB();
    }

    @Bean
    public ProductService createProductservice() {
        return new ProductService();
    }
}