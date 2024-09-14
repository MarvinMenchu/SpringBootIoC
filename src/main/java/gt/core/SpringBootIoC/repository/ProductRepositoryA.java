package gt.core.SpringBootIoC.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("productMySQLRepository")
public class ProductRepositoryA implements ProductRepository {
    public ProductRepositoryA() {
        System.out.println("Creando la instancia de " + ProductRepositoryA.class.getSimpleName());
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