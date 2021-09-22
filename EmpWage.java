package com.fellowship;

public class EmpWage {
	// constants
	public static final int IS_FULL_TIME = 2;
	public static final int IS_PART_TIME = 1;

	public static int computeEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		// variable
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		// computation
		while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
			totalWorkingDays++;
			double empCheck = Math.floor(Math.random() * 10) % 3;
			switch ((int) empCheck) {
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
				break;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day#: " + totalWorkingDays + "EmpHrs: " + empHrs);
		}
		int totalEmpWage = totalEmpHrs * empRatePerHour;
		System.out.println("Total Emp Wage: " + totalEmpWage);
		return totalEmpWage;
	}

	public static void main(String[] args) {
		computeEmpWage("Dmart", 20, 2, 10);
		computeEmpWage("Reliance", 10, 6, 20);

	}
}