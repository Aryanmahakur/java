import java.util.Scanner; // Import the Scanner class

class java01 {  
    public static void main(String[] args) {
       

        // System.out.print("Enter your name: "); // Prompting user for input
        // String name = sc.nextLine(); // Reading user input
        // System.out.println("enter mark of math");
        // int math = sc.nextInt();
        // System.out.println("enter mark of science");
        // int science = sc.nextInt();
        
        // System.out.println("enter mark of english");
        // int english = sc.nextInt();
        
        // System.out.println("enter mark of sst");
        // int sst = sc.nextInt();
        
        // System.out.println("enter mark of hindi");
        // int hindi = sc.nextInt();
        
        // System.out.println("Hello, " + name); // Output user input
        // int totalmarks= math+science+english+sst+hindi;
        // int totalpercentage= totalmarks/5;
        // System.out.println("total marks is "+totalmarks);  
        // System.out.println("total percentage is "+totalpercentage); 
        //  String name= "aryan";
        //   name=name.replace("a","b");
        // System.out.println(name);
        // sc.close(); // Closing Scanner to prevent resource leak
        // conditional statement
        // if else
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number (1-7) to get the corresponding day:");
        int day = sc.nextInt(); // Taking input

        // Switch statement to match the number with a day
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }

        sc.close(); // Closing Scanner
    }


        // if(num1>num2){
        //     System.out.println("num1 is greater than num2");
        // }
        // else{
        //     System.out.println("num2 is greater than num1");
        // }
    }
}
