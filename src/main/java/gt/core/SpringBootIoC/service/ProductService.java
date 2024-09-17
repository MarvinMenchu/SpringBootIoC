package gt.core.SpringBootIoC.service;

import gt.core.SpringBootIoC.repository.ProductRepository;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

//@Component
@Service
//@Scope(value = "application")
//@SessionScope // atajos
@RequestScope
//@ApplicationScope
public class ProductService {

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
        System.out.println("=======> Creando la instancia de " + this.getClass().getSimpleName());
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("=======> Destruyendo la instancia de " + this.getClass().getSimpleName());
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