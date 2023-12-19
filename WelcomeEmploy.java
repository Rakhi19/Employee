package Employeedata;
import java.util.*;
import java.lang.*;
public class swichcase
{
    public static final int IS_FULL_TIME=1;
    public static final int IS_PART_TIME=2;
    public static final int EMP_RATE_PER_HOUR=20;
    public static int empHrs=0;
    private static void wageComputation()
    {
        Random ran=new Random();
        int empCheck=(int) Math.floor(Math.random()*10)%3;
        switch(empCheck)
        {
            case IS_FULL_TIME:
                System.out.println("Employee is present full time");
                empHrs=8;
                break;
            case IS_PART_TIME:
                System.out.println("Employee is present part time");
                empHrs=4;
                break;
            default:
                System.out.println("Employee is Absent");
        }
        int empWage=empHrs*EMP_RATE_PER_HOUR;
        System.out.println("Employee wage is ::"+empWage);
    }
    public static void main(String[]args)
    {
        System.out.println("Welcome to Employee Wage Computation program on master branch");
        wageComputation();
    }
}
