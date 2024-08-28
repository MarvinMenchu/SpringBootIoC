package gt.core.SpringBootIoC.service;

import gt.core.SpringBootIoC.repository.ProductRepository;
import gt.core.SpringBootIoC.repository.ProductRepositoryA;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductService {

    @Autowired
    private ProductRepositoryA productRepositoryA;

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