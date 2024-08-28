package gt.core.SpringBootIoC.repository;

public class ProductRepository {
    public ProductRepository() {
        System.out.println("Creando la instancia de " + ProductRepository.class.getSimpleName());
    }

    public void save(String name) {
        System.out.println("Product saved!, " + name);
    }

    public void remove(String name) {
        System.out.println("Product removed!, " + name);
    }
}