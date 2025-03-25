 class recur{
    // Recursive method to calculate factorial
    static int  fibonacci(int n) {
      if(n==0) return 0;
      if(n==1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);  // Recursive call
    }

    public static void main(String[] args) {
        int num = 7;
        int result =  fibonacci(num);
        System.out.println(" fibonacci of " + num + " is: " + result);
        
    }
 }
 