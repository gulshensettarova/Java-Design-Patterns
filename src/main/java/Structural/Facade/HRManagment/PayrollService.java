package Structural.Facade.HRManagment;

public class PayrollService {
    public void processPayroll(String employeeName, double salary) {
        System.out.println("İşçiyə maaş ödənildi: " + employeeName + ", Məbləğ: " + salary+" AZN");
    }
}
