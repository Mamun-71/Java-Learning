import java.util.Scanner;

public class Main {

    public static void printMyName(String name) {
        System.out.println("My name is " + name);
        return;
    }

    public static int sumOfTwoNumbers(int number1, int number2) {
        int sum = number1 + number2;

        return sum;
    }

    public static int calculateFactorial(int n) {
        if (n < 0) {
            return 0;
        }

        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }

    public static void printAverage(double a, double b, double c) {
        double average = (a + b + c) / 3.0;

        System.out.println("Average = " + average);

        return;
    }

    public static int sumOfOddNumbers(int n) {
        int oddSum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                oddSum += i;
            }
        }

        return oddSum;
    }

    public static void greaterNumber(int a, int b) {
        if (a > b) {
            System.out.println(a + ">" + b);
        } else if (a == b) {
            System.out.println(a + "=" + b);
        } else {
            System.out.println(a + "<" + b);
        }
    }

    public static void printCircumferenceOfCircle(double radius) {
        double Pi = 3.1416;

        double circumferenceOfCircle = 2.0 * Pi * radius;

        System.out.println("Circumference Of Circle = " + circumferenceOfCircle);

        return;
    }

    public static boolean eligibleToVote(int age) {

        if (age > 18) {
            return true;
        } else {
            return false;
        }
    }

    public static int findGcd(int a, int b)
    {
        if(b==0) return a;
        return findGcd(b,a%b);
    }

    public static void printFibonacci(int n)
    {
        int x0=0,x1=1;

        for(int i=1; i<=n; i++)
        {
            if (i == 1)
            {
                System.out.print(x0 + " ");
            }
            else if (i == 2)
            {
                System.out.print(x1+" ");
            }
            else
            {
                int temp = x0+x1;
                x0=x1;
                x1=temp;

                System.out.print(x1+" ");
            }

        }
        System.out.println();


    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //String name = scan.next();
        //printMyName(name);

        /*
        int number1,number2;
        number1 = scan.nextInt();
        number2 = scan.nextInt();

        int sum = sumOfTwoNumbers(number1,number2);

        System.out.println("Sum = "+sum);
        */

        /*
        int n = scan.nextInt();
        int factorial = calculateFactorial(n);
        System.out.println("Factorial = "+factorial);
        */

       /*
       double a,b,c;
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();

        printAverage(a,b,c);
        */

        /*
        int n = scan.nextInt();
        int oddSum = sumOfOddNumbers(n);
        System.out.println("Odd Sum = "+oddSum);
        */

        /*
        int a,b;

        a = scan.nextInt();
        b = scan.nextInt();

        greaterNumber(a,b);
        */

        /*
        double radius;

        radius = scan.nextDouble();
        printCircumferenceOfCircle(radius);
        */

        /*int age;
        age = scan.nextInt();
        if(eligibleToVote(age)==true)
        {
            System.out.println("Eligible");
        }
        else
        {
            System.out.println("Not Eligible");
        }
        */

        /*
        int i;
        i = scan.nextInt();

        do {
            System.out.println(i);
        }
        while(i<10);
        */

        /*
        int positive=0,negative=0,zeros=0;

        int p;
        p = scan.nextInt();

        while(p>0)
        {
            p--;

            int n = scan.nextInt();
            if(n==0)
            {
                zeros++;
            }
            else if(n>0)
            {
                positive++;
            }
            else
            {
                negative++;
            }
        }

        System.out.println("Positive = "+positive+" Zeros = "+zeros+" Negative = "+negative);

         */

        /*int x,p;

        x = scan.nextInt();
        p = scan.nextInt();

        double ans = Math.pow(x,p);

        System.out.println(ans);

         */

        /*int a,b;
        a = scan.nextInt();
        b = scan.nextInt();

        int gcd = findGcd(a,b);

        System.out.println("Gcd = "+gcd);
        */

        /*int n = scan.nextInt();
        printFibonacci(n);

         */

        int marks[] = new int[5];
        //int marks[] = new int[3];

        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 78;

        System.out.println(marks[0]);


    }
}
