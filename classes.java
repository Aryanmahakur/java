public class classes {  // Outer class
    public class Employee {  // Inner class
        int id;
        String name;

        // Method to print details
        public void printDetails() {
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
        }
    }

    public static void main(String[] args) {
        // Create an instance of the outer class
        classes outer = new classes();

        // Create an instance of the inner class using the outer class instance
        classes.Employee aryan = outer.new Employee();

        // Assign values
        aryan.id = 15;
        aryan.name = "Aryan";

        // Print details
        aryan.printDetails();
    }
}
