package Employeedata;

import java.util.Random;
import java.util.Scanner;
import java.lang.*;

public class Empdaiwage
{
    public static void main(String[]args)
    {
        Scanner Pc=new Scanner(System.in);
        System.out.println("Enter the IS_PRESENT");
        int IS_PRESENT= Pc.nextInt();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Employee Rate per Hour");
        int Emp_rate_per_hour = sc.nextInt();
        Scanner rc = new Scanner(System.in);
        System.out.println("Enter Employee work Hours");
        int empHrs= rc.nextInt();
        Random ran=new Random();
        int empCheck=(int)Math.floor(Math.random()*10)%2;
        if (empCheck==IS_PRESENT)
        {
            System.out.println("Employee is present");
            empHrs=8;
        }
        else
        {
            System.out.println("Employee is Absent");
        }
        int empWage=empHrs*Emp_rate_per_hour;
        System.out.println("Employee wage is ::"+empWage);
    }
}
