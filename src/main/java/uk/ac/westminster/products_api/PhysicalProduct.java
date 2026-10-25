package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because it has an id, a name and a price like every product, plus shipping details.
// A ShoppingCart is NOT a Product: it contains products (HAS-A), so it would use a List<Product> field.

public class PhysicalProduct extends Product {

    private double weightKg;
    private String dimensions;

    public PhysicalProduct() {
    }

    public PhysicalProduct(Long id, String name, double price,
                           double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}