package ru.mtuci.silmpleapi1.service;

import ru.mtuci.silmpleapi1.model.Product;
import java.util.List;

public interface ProductService {
    Product get (Long id);

    List<Product> getAll();

    Product save(Product product);

    void delete(Long id);
}
