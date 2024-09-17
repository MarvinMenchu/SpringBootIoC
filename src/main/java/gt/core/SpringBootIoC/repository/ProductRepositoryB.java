package gt.core.SpringBootIoC.repository;

import gt.core.SpringBootIoC.service.ProductService;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("productXMLRepository")
public class ProductRepositoryB implements ProductRepository {

//    public ProductRepositoryB() {
//        System.out.println("Creando la instancia de " + ProductRepositoryB.class.getSimpleName());
//    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("=======> Creando la instancia de " + this.getClass().getSimpleName());
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("=======> Destruyendo la instancia de " + this.getClass().getSimpleName());
    }

    public void save(String name) {
        System.out.println("== SAVE " + this.getClass().getSimpleName() +  "==");
        System.out.println("Product saved!, " + name);
    }

    public void remove(String name) {
        System.out.println("== REMOVE " + this.getClass().getSimpleName() +  "==");
        System.out.println("Product removed!, " + name);
    }
}