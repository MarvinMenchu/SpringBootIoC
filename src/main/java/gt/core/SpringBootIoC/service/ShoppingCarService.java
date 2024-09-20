package gt.core.SpringBootIoC.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Service
@ApplicationScope
public class ShoppingCarService {
    private List<String> products = new ArrayList<>();
    private Integer counter = 0;

    public void add() {
        counter++;
        products.add(counter.toString() + " - Microfono");
    }

    public List<String> get() {
        return products;
    }

    @PostConstruct
    public void init() {
        System.out.println("Creando instancia de " + this.getClass().getName());
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destruyendo instancia de " + this.getClass().getName());
    }
}