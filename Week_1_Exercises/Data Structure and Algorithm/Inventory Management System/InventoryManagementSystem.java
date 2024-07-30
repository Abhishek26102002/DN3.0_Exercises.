import java.util.HashMap;

public class InventoryManagementSystem {
    private HashMap<String, Product> inventory;

    public InventoryManagementSystem() {
        inventory = new HashMap<>();
    }

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    public void updateProduct(String productId, Product updatedProduct) {
        if (inventory.containsKey(productId)) {
            inventory.put(productId, updatedProduct);
        } else {
            System.out.println("Product not found.");
        }
    }

    public void deleteProduct(String productId) {
        if (inventory.containsKey(productId)) {
            inventory.remove(productId);
        } else {
            System.out.println("Product not found.");
        }
    }

    public Product getProduct(String productId) {
        return inventory.get(productId);
    }

    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();

        Product product1 = new Product("P001", "Laptop", 10, 999.99);
        ims.addProduct(product1);

        Product product2 = new Product("P002", "Smartphone", 15, 699.99);
        ims.addProduct(product2);

        // Update a product
        Product updatedProduct1 = new Product("P001", "Laptop", 8, 949.99);
        ims.updateProduct("P001", updatedProduct1);

        // Delete a product
        ims.deleteProduct("P001");

        // Get a product
        Product retrievedProduct = ims.getProduct("P002");
        System.out.println("Retrieved Product: " + retrievedProduct.getProductName());
    }
}
