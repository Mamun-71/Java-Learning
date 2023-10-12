import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        //Print
        System.out.println("Hello world");
        System.out.print("Hello world\n My name is mamun\n");
        System.out.print("Programmer");
       */

       /*
       //Variables
       String name = "tony stark";
       int age = 48;
       double price = 27.3;
       int a = 25;
       int b = 10;

       b = 20;

       name = "ironman";

       int x = 10;
       int y = 5;

       int mul = x*y;

       System.out.println(mul);
       */


        /*
        //input


       Scanner scan = new Scanner(System.in);
        String name = scan.next();//next function takes just one token
        System.out.println(name);
        String fullName = scan.nextLine();
        System.out.println(fullName);


        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum = a+b;

        System.out.println(sum);

        */

        //Conditional Statements

        /*
        //if else
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if(number%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }

        int age = scan.nextInt();
        if(age>=18)
        {
            System.out.println("You have an access to enter");
        }
        else
        {
            System.out.println("Prohabitated to enter");
        }

         */

        /*
        // switch

        Scanner scan = new Scanner(System.in);
        int butten = scan.nextInt();

        switch (butten)
        {
            case 1 : System.out.println("Pepsi");
            break;
            case 2 : System.out.println("7up");
            break;
            case 3: System.out.println("Cola");
            break;
            default:
                System.out.println("Nothing to drink");
        }

        */

        //Loops for,while,do while

       /* Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        */

        /*
        //for loop
        for(int num=1; num<=n; num++)
        {
            System.out.println(num);
        }
        */

        /*
        //while loop
        int num = 1;
        while(num<=n)
        {
            System.out.println(num);
            num++;
        }
        */

        /*int num = 1;

        do {
            System.out.println(num);
            num++;
        }
        while (num<=n);
        */

        /*int sum = 0;

        for(int i=1; i<=n; i++)
        {
            sum+=i;
        }

        System.out.println(sum);
        */

        /*Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        */

        /*Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();

        for (int i = 1; i <= row; i++)
        {
            for(int j=1; j<=i; j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        
         */



    }
}
