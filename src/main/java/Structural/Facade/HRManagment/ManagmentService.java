package Structural.Facade.HRManagment;

public class ManagmentService {
    public static void main(String[] args) {
        EmployeeManagementFacade managementFacade=new EmployeeManagementFacade();
        managementFacade.onboardEmployee("Gulshan Sattarova",2000);
        managementFacade.evaluateAndAdjustSalary("Gulshan Sattarova",2000);
    }
}
