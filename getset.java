public class getset{
    private int id;
    private String name;
    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        // Creating an object of GetAndSet
        getset obj = new getset();

        // Setting the name
        obj.setName("Aryan");

        // Getting and printing the name
        System.out.println("Name: " + obj.getName());
    }
}
