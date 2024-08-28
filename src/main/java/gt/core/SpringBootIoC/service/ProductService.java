package gt.core.SpringBootIoC.service;

import gt.core.SpringBootIoC.repository.ProductRepository;
import gt.core.SpringBootIoC.repository.ProductRepositoryA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ProductService {

    @Autowired
    //@Qualifier("productMySQLRepository")
    private ProductRepository productRepositoryA;

    public ProductService() {
        System.out.println("Creando la instancia de " + ProductService.class.getSimpleName());
    }

    public void save(String name) {
        productRepositoryA.save(name);
    }

    public void remove(String name) {
        productRepositoryA.remove(name);
    }
}