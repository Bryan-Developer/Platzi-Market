package bryan.developer.api.platzi.market.persistence;

import bryan.developer.api.platzi.market.persistence.crud.ProductoCrudRepository;
import bryan.developer.api.platzi.market.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
