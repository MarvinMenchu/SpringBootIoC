package gt.core.SpringBootIoC.repository;

public interface ProductRepository {
    void save(String name);
    void remove(String name);
}