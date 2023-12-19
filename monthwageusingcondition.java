package Employeedata;

import java.util.Random;
import java.util.Scanner;
public class Emppartwage
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Full time");
        int IS_FULL_TIME=sc.nextInt();
        Scanner rc=new Scanner(System.in);
        System.out.println("Enter the Part time");
        int IS_PART_TIME=rc.nextInt();
        Scanner pc=new Scanner(System.in);
        System.out.println("Enter the Employee rate per Hour");
        int EMP_RATE_PER_HOUR= pc.nextInt();
        Scanner tc=new Scanner(System.in);
        System.out.println("Enter the Employee Hours");
        int empHrs=tc.nextInt();
        Random ran=new Random();
        int empCheck=(int)Math.floor(Math.random()*10)%3;
        if(empCheck==IS_FULL_TIME)
        {
            System.out.println("Employee is present Full time");
            empHrs=8;
        } else if (empCheck==IS_PART_TIME)
        {
         System.out.println("Employee is present Part time");
         empHrs=4;
        }
        else
        {
            System.out.println("Employee is Absent");
        }
         int empWage=empHrs*EMP_RATE_PER_HOUR;
          System.out.println("Employee wage is::"+empWage);
    }
}
