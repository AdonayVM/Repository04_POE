package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author myslf
 */
public class CategoriesRepository {
    public static List<String> getCategories(){
        List<String> categories = new ArrayList<>(Arrays.asList(
        "Útiles", "Comida", "Bebida", "Mascota", "Hogar", "Limpieza", "Higiene"
        ));
        return categories;    
    }
}
