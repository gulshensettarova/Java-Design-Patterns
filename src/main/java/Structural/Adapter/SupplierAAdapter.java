package Structural.Adapter;

public class SupplierAAdapter implements InventoryProvider{
    private SupplierAInventoryService supplierAInventoryService;

    public SupplierAAdapter(SupplierAInventoryService supplierAInventoryService) {
        this.supplierAInventoryService = supplierAInventoryService;
    }

    @Override
    public int getAvailableStock(String productCode) {
        return supplierAInventoryService.checkStock(productCode);
    }
}
