package Employeedata;

import java.util.Random;
import java.util.Scanner;
public class wageformonth
{
 public static final int IS_FULL_TIME=1;
 public static final int IS_PART_TIME=2;
 public static final int EMP_RATE_PER_HOUR=20;
    public static void main(String[]args)
 {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the empHrs");
     int empHrs= sc.nextInt();
     Scanner rc=new Scanner(System.in);
     System.out.println("Enter todayEmpHrs");
     int totalEmpHrs=rc.nextInt();
     Scanner tc=new Scanner(System.in);
     System.out.println("Enter the no of working Days");
     int numofWorkingDays= tc.nextInt();
         Random ran=new Random();
         for (int i=0;i<numofWorkingDays;i++)
         {
             int empCheck=(int) Math.floor(Math.random()*10)%3;
             switch (empCheck)
             {
                 case IS_FULL_TIME:
                     empHrs=8;
                     break;
                 case IS_PART_TIME:
                     empHrs=4;
                     break;
                 default:
             }
             totalEmpHrs=totalEmpHrs+empHrs;
         }
         int empWage=totalEmpHrs*EMP_RATE_PER_HOUR;
         System.out.println("Employee wage is ::"+empWage);
     }

     }


