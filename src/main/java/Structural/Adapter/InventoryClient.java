package Structural.Adapter;

public class InventoryClient {
    public static void main(String[] args) {
        // Supplier A üçün adapter istifadə olunur
        InventoryProvider supplierAProvider = new SupplierAAdapter(new SupplierAInventoryService());
        System.out.println("Supplier A stok: " + supplierAProvider.getAvailableStock("ABC123"));

        // Supplier B üçün adapter istifadə olunur
        InventoryProvider supplierBProvider = new SupplierBAdapter(new SupplierBInventoryService());
        System.out.println("Supplier B stok: " + supplierBProvider.getAvailableStock("ABC123"));
    }
}
