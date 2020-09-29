package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import NewClass.UnitTesting;

class UnitTestingTest {
	UnitTesting ut;
    String []nd = {"Marketing","Research"};
    ArrayList<String> e = new ArrayList<String>();
	
	
	@BeforeEach
	void setUp() throws Exception {
		ut  = new UnitTesting();
	}

	@Test
	void testDA() {
		assertEquals(2000,ut.DA(10,20000));
		
	}
	
	@Test
	void testHRA() {
		assertEquals(1600,ut.HRA(8,20000));
		
	}
	
	@Test
	void testPF() {
		assertEquals(1000,ut.PF(5,20000));
		
	}
	
	@Test
	void testGrossSalary() {
		assertEquals(24600,ut.GrossSalary(20000,2000,1600,1000));
	}
	
	@Test
	void testEPF() {
		assertEquals(500,ut.EPF(1000));
	}
	
	@Test
	void testLIC() {
		assertEquals(250,ut.LIC(500));
	}
	
	@Test
	void testDeductions() {
		assertEquals(750,ut.Deductions(500,250));
	}
	
	@Test
	void testNetSalary() {
		assertEquals(24100,ut.NetSalary(24600,500));
	}
	
	@Test
	void testAddEmployee() {
		e.add("Neha");
		assertTrue(e.equals(ut.AddEmployee("Neha")));
	}
	
	@Test
	void testDeleteEmployee() {
		assertTrue(e.equals(ut.DeleteEmployee()));
	}
	
	@Test 
	void testCreateNewDepartment() {
		assertTrue(Arrays.equals(nd,ut.CreateNewDepartment("Marketing","Research")));
	}
	
	
	@ Test 
	void testSearchEmployee() {
		assertEquals(false,ut.SearchEmployee("Neha"));
	}
}
