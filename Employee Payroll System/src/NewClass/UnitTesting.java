package NewClass;

import java.util.ArrayList;

public class UnitTesting {
	ArrayList<String> employee = new ArrayList<String>();
	String []dep = new String[2]; 
	
	public double DA(double dap, double basic_salary) {
		double da = (dap/100)*basic_salary;
		return da;
	}
	
	public double HRA(double hra_percent, double basic_salary) {
		double hra = (hra_percent / 100) * basic_salary;
		return hra;
	}
	
	public double PF(double pf_percent, double basic_salary) {
		double pf = (pf_percent / 100) * basic_salary;
		return pf;
	}
	
	public double GrossSalary(double basic_salary, double da, double hra, double pf) {
		double gross_salary = basic_salary + da + hra + pf;
		return gross_salary;
	}
	
	public int EPF(int pf) {
		int epf = pf/2;
		return epf;
	}
	
	public int LIC(int epf) {
		int lic = epf/2;
		return lic;
	}
	
	public int Deductions(int epf, int lic) {
		int deductions = epf + lic;
		return deductions;
	}
	
	public double NetSalary(int gross_salary, int deductions) {
		double net_salary = gross_salary - deductions;
		return net_salary;
	}
	
	//employee 
	
	public ArrayList<String> AddEmployee(String x) {
		employee.add(x);
		return employee;
	}
	
	
	public ArrayList<String> DeleteEmployee() {
		employee.clear();
		return employee;
	}
	
	public boolean SearchEmployee(String s) {
		if(employee.contains(s)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	//department
	
	public String[] CreateNewDepartment(String s, String t){
		dep[0] = s;
		dep[1] = t;
		return dep;
	}
	
	
}
