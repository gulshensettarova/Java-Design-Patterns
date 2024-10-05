package Structural.Adapter;

public class SupplierBAdapter implements InventoryProvider{
    private SupplierBInventoryService supplierBInventoryService;

    public SupplierBAdapter(SupplierBInventoryService supplierBInventoryService) {
        this.supplierBInventoryService = supplierBInventoryService;
    }

    @Override
    public int getAvailableStock(String productCode) {
        return supplierBInventoryService.fetchStock(productCode);
    }
}
