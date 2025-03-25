public class employee {
    int id;
    String name;
    int salary;
    // Method to print details
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
    public void getsalary(){
         System.out.println("salary: " + salary);
    }
    
    public static void main(String[] args) {
        // Create an instance of Employee
        employee aryan = new employee();

        // Assign values
        aryan.id = 15;
        aryan.name = "Aryan";
        aryan.salary=12345;
        // Print details
        aryan.printDetails();
        aryan.getsalary();
    }
}
