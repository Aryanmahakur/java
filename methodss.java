class methodss {
     
    static class Example {  
        int add(int a, int b) {
            return a + b;
        }
    }
    static class Examples {  
        int add(int a, int b) {
            return a - b;
        }
    }
     
    public static void main(String[] args) {
        Example obj1 = new Example();  
        int sum = obj1.add(5, 10);
        System.out.println("Sum: " + sum);

        Examples obj2 = new Examples();  // Corrected object creation
        int difference = obj2.add(5, 10);
        System.out.println("Difference: " + difference);
    }
}
