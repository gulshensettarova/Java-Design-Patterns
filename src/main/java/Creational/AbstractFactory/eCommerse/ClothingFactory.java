package Creational.AbstractFactory.eCommerse;

public class ClothingFactory implements ProductFactory {
    public Product createPhone() {
        return null; // Geyim üçün uyğunsuz
    }
    public Product createLaptop() {
        return null; // Geyim üçün uyğunsuz
    }

    public Product createShirt() {
        return new CasualShirt();
    }
    public Product createPants() {
        return new Jeans();
    }
}