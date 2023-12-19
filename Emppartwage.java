package Employeedata;

import java.util.Random;
import java.util.Scanner;

public class Employeepreabse
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the is Present");
        int isPresent= sc.nextInt();

        final int IS_PRESENT=1;
        Random ran=new Random();
        int empCheck=(int)Math.floor(Math.random()*10)%2;
        if (empCheck==isPresent)
        {
            if (empCheck==IS_PRESENT)
            {
                System.out.println("Employee is present");
            }
            else
            {
             System.out.println("Employee is Absent");
            }
        }
    }
}
