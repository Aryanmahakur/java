class Product {
    String name;
    int price;

   

    // Constructor 2: Parameterized constructor
    Product(String n, int p) {
        name = n;
        price = p;
    }

    void display() {
        System.out.println("Product Name: " + name + ", Price: " + price);
    }

    public static void main(String[] args) {
      
        Product p2 = new Product("Laptop", 50000); // Calls parameterized constructor

       
        p2.display();
    }
}
