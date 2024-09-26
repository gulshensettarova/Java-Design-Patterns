package Structural.Facade.Restaurant;

public class RestaurantFacade {
    private OrderService order;
    private ReservationService reservation;
    private PaymentService payment;

    public RestaurantFacade() {
        this.order = new OrderService();
        this.reservation = new ReservationService();
        this.payment = new PaymentService();
    }

    public void dineIn(int reserveNumber,String customerOrder,double paymentAmount){
        reservation.reserveTable(reserveNumber);
        order.order(customerOrder);
        payment.processPayment(paymentAmount);
        System.out.println("Restoranda xidmət tamamlandı.");
    }

}
