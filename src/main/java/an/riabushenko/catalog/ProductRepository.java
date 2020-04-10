package an.riabushenko.catalog;


import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
@AllArgsConstructor
public class ProductRepository {

    @Getter
    private ArrayList<Product> products = new ArrayList<Product>();

    public ProductRepository() {
        new ArrayList<>();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public List<Product> findAll() {
        return this.products;
    }


    public Optional<Product> findOneById(UUID id) {
        return this.products.stream()
                .filter(product -> Objects.equals(id, product.getId()))
                .findFirst();
    }

}




