public class Main {
    public static void main(String[] args) throws Exception {
    }

        public static void printEmployee(Employee employee) {
            employee.setName("Santiago Corrêa");
            ((Manager) employee).setLogin("santiagocorrea");
            ((Manager) employee).setPassword("123456");
            
            System.out.println(employee.getName());
            System.out.println(((Manager) employee).getLogin());
            System.out.println(((Manager) employee).getPassword());
            

        }
    }
