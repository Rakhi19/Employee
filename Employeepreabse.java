package Employeedata;

import java.util.Random;

public class refactor
{
    public static final int IS_FULL_TIME=1;
    public static final int IS_PART_TIME=2;
    public static final int EMP_RATE_PER_HOUR=20;
    public static final int MAX_HRS_IN_MONTHS=100;
    public static int empHrs=0, totalWorkingDays=0, totalEmpHrs=0;
    public static int numofWorkingDays=20;
    private static void Employeewage()
    {
        Random rand=new Random();
        while(totalEmpHrs<MAX_HRS_IN_MONTHS&&totalWorkingDays<numofWorkingDays)
        {
            int empCheck=(int) Math.floor(Math.random()*10)%3;
            switch(empCheck)
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
    public static void main(String[]args)
    {
        System.out.println("Welcome to Employee Wage Computation program on Main Branch");
        Employeewage();
    }

}
