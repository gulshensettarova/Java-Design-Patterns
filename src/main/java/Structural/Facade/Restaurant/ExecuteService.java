package Structural.Facade.Restaurant;

public class ExecuteService {
    public static void main(String[] args) {
        RestaurantFacade service=new RestaurantFacade();
        service.dineIn(2810,"Adicto & Rafaello & Tea",10);
    }
}
