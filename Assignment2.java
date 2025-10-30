public class EmployeeMain {

    // Base class
    static class Employee {
        private int empId;
        private String name;
        private double basicSalary;

        public static int totalEmployees = 0;
        public static final String COMPANY_NAME = "TechNova Pvt. Ltd.";

        // Constructor
        public Employee(int empId, String name, double basicSalary) {
            this.empId = empId;
            setName(name);
            if (basicSalary < 10000) {
                System.out.println("Invalid salary! Setting basic salary to 10000.0");
                this.basicSalary = 10000;
            } else {
                this.basicSalary = basicSalary;
            }
            totalEmployees++;
        }

        // Setters and Getters
        public void setName(String name) {
            if (name != null && !name.isEmpty()) {
                this.name = name;
            } else {
                System.out.println("Invalid name! Keeping old value.");
            }
        }

        public void setBasicSalary(double salary) {
            if (salary < 10000) {
                this.basicSalary = 10000;
            } else {
                this.basicSalary = salary;
            }
        }

        public int getEmpId() {
            return empId;
        }

        public String getName() {
            return name;
        }

        public double getBasicSalary() {
            return basicSalary;
        }

        public final void displayCompanyName() {
            System.out.println("Company: " + COMPANY_NAME);
        }

        public double calculateSalary() {
            return basicSalary;
        }

        public static int getTotalEmployees() {
            return totalEmployees;
        }
    }

    // Manager subclass
    static class Manager extends Employee {
        private double performanceBonus;

        public Manager(int empId, String name, double basicSalary, double performanceBonus) {
            super(empId, name, basicSalary);
            this.performanceBonus = performanceBonus;
        }

        @Override
        public double calculateSalary() {
            double salary = getBasicSalary() + performanceBonus;
            System.out.println("Manager Salary Calculated: " + salary);
            return salary;
        }
    }

    // Developer subclass
    static class Developer extends Employee {
        private double projectAllowance;

        public Developer(int empId, String name, double basicSalary, double projectAllowance) {
            super(empId, name, basicSalary);
            this.projectAllowance = projectAllowance;
        }

        @Override
        public double calculateSalary() {
            double salary = getBasicSalary() + projectAllowance;
            System.out.println("Developer Salary Calculated: " + salary);
            return salary;
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create array of employees
        Employee[] employees = new Employee[3];

        // Create Manager and Developer objects
        employees[0] = new Manager(101, "Alice", 15000, 3000);
        employees[1] = new Developer(102, "Bob", 14000, 2000);
        employees[2] = new Employee(103, "Charlie", 8000); // invalid salary test

        // Print company created once
        System.out.println("Employee created at TechNova Pvt. Ltd.");

        // Calculate salaries (polymorphism)
        employees[0].calculateSalary();
        employees[1].calculateSalary();

        System.out.println("Employee Details:");
        for (Employee emp : employees) {
            double salary = emp.calculateSalary();
            System.out.println("ID: " + emp.getEmpId() + " | Name: " + emp.getName()
                    + " | Company: " + Employee.COMPANY_NAME + " | Salary: " + salary);
        }

        System.out.println("Total Employees: " + Employee.getTotalEmployees());
    }
}
