package Structural.Facade.HRManagment;

public class PerformanceService {
    public boolean evaluatePerformance(String employeeName) {
        int customerFeedback = getCustomerFeedback(employeeName);
        int projectTimeliness = getProjectTimeliness(employeeName);
        int workQuality = getWorkQuality(employeeName);
        double averageScore = (customerFeedback + projectTimeliness + workQuality) / 3.0;
        System.out.println("İşçinin performansı qiymətləndirildi: " + employeeName + ", Orta bal: " + averageScore);
        return averageScore >= 75;
    }
    private int getCustomerFeedback(String employeeName) {
        return (int) (Math.random() * 100);
    }
    private int getProjectTimeliness(String employeeName) {
        return (int) (Math.random() * 100);
    }
    private int getWorkQuality(String employeeName) {
        return (int) (Math.random() * 100);
    }

}
