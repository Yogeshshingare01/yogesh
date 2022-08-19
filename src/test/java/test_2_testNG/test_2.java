package test_2_testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test_2 {
@BeforeSuite
public void b1() {
	System.out.println("b1");
}
@BeforeTest
public void b2() {
	System.out.println("b2");
}
@BeforeClass
public void b3() {
	System.out.println("b3");
}
@BeforeMethod
public void b4() {
	System.out.println("b4");
}
@Test
public void T1() {
	System.out.println("T1");
}

@AfterMethod
public void A1() {
	System.out.println("A1");
}
@AfterClass
public void A2() {
	System.out.println("A2");
}
@AfterTest
public void A3() {
	System.out.println("A3");
}
@AfterSuite
public void A4() {
	System.out.println("A4");
}
}
