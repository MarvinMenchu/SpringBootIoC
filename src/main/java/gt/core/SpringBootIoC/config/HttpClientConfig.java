package gt.core.SpringBootIoC.config;

import gt.core.SpringBootIoC.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class HttpClientConfig {

    // cuarta forma de inyectar dependencias por medio de un método
    @Bean
    public RestTemplate restTemplate(@Qualifier("productXMLRepository") ProductRepository productRepository) {
        System.out.println("Creando un RestTemplate");
        productRepository.save("T-SHIT M");
        return new RestTemplate();
    }
}