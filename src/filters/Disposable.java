package filters;
import products.Product;
public class Disposable implements Filterable<Product>{
    @Override
    public boolean filter(Product o) {
        return false;
    }
}
 