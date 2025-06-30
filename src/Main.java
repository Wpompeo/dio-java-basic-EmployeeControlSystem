public class Main {
    public static void main(String[] args) throws Exception {
        printEmployee(new Manager());
        printEmployee(new Salesman());
    }

        public static void printEmployee(Employee employee) {

            System.out.printf("======%s=======\n", employee.getClass().getCanonicalName());           
            if (employee instanceof Manager) {
                Manager manager = (Manager) employee;
                manager.setCode("123");
                manager.setName("Santiago");
                manager.setSalary(5000);
                manager.setLogin("santiago");
                manager.setPassword("123456");
                manager.setCommision(1200);

                System.out.println("Manager Details:");
                System.out.printf("Name: %s\n", manager.getName());
                System.out.printf("Code: %s\n", manager.getCode());
                System.out.printf("Salary: %.2f\n", manager.getSalary());
                System.out.printf("Login: %s\n", manager.getLogin());
                System.out.printf("Password: %s\n", manager.getPassword());
            } else if (employee instanceof Salesman salesman) {
                salesman.setCode("456");
                salesman.setName("Tatiana");
                salesman.setSalary(2800);
                salesman.setPercentPerSold(0.10);

                System.out.println("Salesman Details:");
                System.out.printf("Name: %s\n", salesman.getName());
                System.out.printf("Code: %s\n", salesman.getCode());
                System.out.printf("Salary: %.2f\n", salesman.getSalary());
                System.out.printf("Percent per Sold: %.2f\n", salesman.getPercentPerSold());
            }
            System.out.println("=====================");           

        }
    }
