import products.Product;

public class Main {
    public static void main(String[] args) {
        Product car = new Product("car", 50000.1,"ad984im");
        Product bike = new Product("bike", 5200.90,"ad985im");
        Product motorbike = new Product("motorbike", 23500.60,"ad986im");

        Integer numA = Integer.valueOf(10);

        Integer numB = Integer.valueOf(10);

        System.out.println(numA == numB);

    }
}