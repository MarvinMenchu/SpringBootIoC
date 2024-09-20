package gt.core.SpringBootIoC.service;

import gt.core.SpringBootIoC.repository.ProductRepository;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class ProductService {

    @Value("${messages.success}")
    private String message;

    private ProductRepository productRepository;


//    public ProductService(ProductRepository productRepository) {
//        this.productRepository = productRepository;
//        System.out.println("Creando la instancia de " + ProductService.class.getSimpleName());
//    }

    public ProductService() {
        System.out.println("Creando la instancia de " + ProductService.class.getSimpleName());
    }


    @PostConstruct
    public void postConstruct() {
        System.out.println("=======> Creando la instancia de " + ProductService.class.getSimpleName());
        System.out.println("=======> Mensaje desde application.properties: " + message);
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("=======> Destruyendo la instancia de " + ProductService.class.getSimpleName());
    }

    public void save(String name) {
        productRepository.save(name);
    }

    public void remove(String name) {
        productRepository.remove(name);
    }

    @Qualifier("productXMLRepository")
    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}