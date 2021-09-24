package com.fellowship;

public class EmpWage {
	// constants
	public static final int IS_FULL_TIME = 2;
	public static final int IS_PART_TIME = 1;

	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth;
	private int totalEmpWage;

	public EmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}

	public void computeEmpWage() {
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
				// break;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day#: " + totalWorkingDays + "EmpHrs: " + empHrs);
		}
		 totalEmpWage = totalEmpHrs * empRatePerHour;
	}

	@Override
	public String toString() {
		System.out.println("Total Emp Wage: " + totalEmpWage);
		return "Total Emp Wage for company:" + company + " is " + totalEmpWage;

	}

	public static void main(String[] args) {
		EmpWage dmart = new EmpWage("Dmart", 5, 2, 10);
		EmpWage reliance = new EmpWage("Reliance", 10, 6, 20);
		dmart.computeEmpWage();
		System.out.println(dmart);
		reliance.computeEmpWage();
		System.out.println(reliance);

	}
}