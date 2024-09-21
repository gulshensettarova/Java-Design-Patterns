package Creational.AbstractFactory.ToDoList.EmployeeFactory;

public enum EmployeeFactory {
    BACKEND_DEVELOPER{
        @Override
        public Employee createEmployee() {
            return new BackendDeveloper();
        }
    },
    QA_TESTER{
        @Override
        public Employee createEmployee() {
            return new QATester();
        }
    },
    DEVOPS{
        @Override
        public Employee createEmployee() {
            return new Devops();
        }
    };

    public abstract Employee createEmployee();
}
