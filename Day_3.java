/*import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args)
    {

        int q,a,b,n;

        Scanner scan = new Scanner(System.in);
        int lineNum = 0;

        while (scan.hasNext())
        {
            System.out.println(++lineNum + " "+scan.nextLine());
            scan.close();
        }



    }
}
*/

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
        int arr[][] = new int[10][10];

        Scanner scan = new Scanner(System.in);

        for(int i=1; i<=3; i++)
        {
            for(int j=1; j<=3; j++)
            {
                arr[i][j] = scan.nextInt();
            }
        }

        for(int i=1; i<=3; i++)
        {
            for(int j=1; j<=3; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

         */

        /*String name1 = scan.next();
        String name2 = scan.next();

        if(name1.compareTo(name2)==0)
        {
            System.out.println("YES");
        }

        String fullName = name1+" "+name2;
        System.out.println(fullName);

        for(int i=0; i<fullName.length(); i++)
        {
            System.out.print(fullName.charAt(i)+" ");
        }

         */

        /*String s = scan.nextLine();

        String sub =s.substring(2,4);
        System.out.println(sub);

         */

        /*
        //StringBuilder
        StringBuilder sb = new StringBuilder("Mamun");
        System.out.println(sb);

        //char at index
        System.out.println(sb.charAt(0));

        //set char at index
        sb.setCharAt(0,'P');
        System.out.println(sb);

        //insert at index
        sb.insert(1,"K");
        System.out.println(sb);

        //delete
        sb.delete(1,2);
        System.out.println(sb);

        //append
        sb.append("j");
        System.out.println(sb);

        // reverse string

        for(int i=0; i<sb.length()/2; i++)
        {
            int front = i;
            int back = sb.length()-front-1;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }

        System.out.println(sb);


         */

          

    }
}
