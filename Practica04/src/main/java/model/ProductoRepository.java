package model;

import java.util.List;

/**
 *
 * @author myslf
 */
public class ProductoRepository {
    public static List<Producto> getProducto(){
        List<Producto> producto = List.of(
            new Producto(1, 3.99f, "Caja de lápiz", "Útiles", "*Descripción de ejemplo*"),
            new Producto(2, 0.6f, "Ramen instantáneo", "Comidas", "*Descripción de ejemplo*"),
            new Producto(3, 2f, "Coca-cola 3 litros", "Bebidas", "*Descripción de ejemplo*"),
            new Producto(4, 2.49f, "Papel higiénico", "Hogar", "*Descripción de ejemplo*"),
            new Producto(5, 0.99f, "Pelota para perro", "Mascota", "*Descripción de ejemplo*")
        );
        return producto;
    }
}
