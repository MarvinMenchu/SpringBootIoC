package gt.core.SpringBootIoC.service;

import gt.core.SpringBootIoC.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductService(@Qualifier("productMySQLRepository") ProductRepository productRepository) {
        this.productRepository = productRepository;
        System.out.println("Creando la instancia de " + ProductService.class.getSimpleName());
    }

    public ProductService() {
        System.out.println("Creando la instancia de " + ProductService.class.getSimpleName());
    }

    public void save(String name) {
        productRepository.save(name);
    }

    public void remove(String name) {
        productRepository.remove(name);
    }
}