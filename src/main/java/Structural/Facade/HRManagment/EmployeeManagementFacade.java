package Structural.Facade.HRManagment;

public class EmployeeManagementFacade {
    private PayrollService payrollService;
    private  PerformanceService performanceService;
    private HiringService hiringService;
    private RegistrationService registrationService;


    public EmployeeManagementFacade(){
        this.hiringService=new HiringService();
        this.registrationService=new RegistrationService();
        this.performanceService=new PerformanceService();
        this.payrollService=new PayrollService();
    }
    public void onboardEmployee(String employeeName, double salary) {
        registrationService.registerEmployee(employeeName);
        hiringService.hireEmployee(employeeName);
        payrollService.processPayroll(employeeName, salary);
        System.out.println("İşçi onboarding prosesi tamamlandı: " + employeeName);
    }

    public void evaluateAndAdjustSalary(String employeeName, double currentSalary) {
        boolean isPerformanceGood = performanceService.evaluatePerformance(employeeName);
        if (isPerformanceGood) {
            double newSalary = currentSalary * 1.15; // 15% artım
            payrollService.processPayroll(employeeName, newSalary);
            System.out.println("İşçinin maaşı artırıldı: " + employeeName + ", Yeni maaş:" + newSalary+" AZN");
        } else {
            System.out.println(employeeName+ " adlı işçi üçün maaş artımı təsdiqlənmədi");
        }
    }
}
