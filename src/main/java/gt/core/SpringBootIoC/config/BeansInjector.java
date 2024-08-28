package gt.core.SpringBootIoC.config;

import gt.core.SpringBootIoC.repository.ProductRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansInjector {

    @Bean
    public ProductRepository productRepository() {
        return new ProductRepository();
    }
}