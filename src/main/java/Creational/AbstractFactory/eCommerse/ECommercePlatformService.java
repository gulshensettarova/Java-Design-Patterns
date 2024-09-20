package Creational.AbstractFactory.eCommerse;

public class ECommercePlatformService {
    public static void main(String[] args) {
        ProductFactory electronicsFactory = new ElectronicsFactory();
        Product phone = electronicsFactory.createPhone();
        phone.productType(); // Çıxış: Smartphone

        ProductFactory clothingFactory = new ClothingFactory();
        Product shirt = clothingFactory.createShirt();
        shirt.productType(); // Çıxış: Casual Shirt
    }
}
