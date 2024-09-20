package Creational.AbstractFactory.eCommerse;

public class ElectronicsFactory implements ProductFactory {
    public Product createPhone() {
        return new Smartphone();
    }
    public Product createLaptop() {
        return new GamingLaptop();
    }

    public Product createShirt() {
        return null; // Elektronika üçün uyğunsuz
    }
    public Product createPants() {
        return null; // Elektronika üçün uyğunsuz
    }
}