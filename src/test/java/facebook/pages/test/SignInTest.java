package facebook.pages.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import facebook.base.Facebook_BaseClass;
import facebook.pages.signInClass;
import facebook.utilities.Utilities;

public class SignInTest extends Facebook_BaseClass{
	
Utilities util;
signInClass signin;


public SignInTest() {
super();
}

@BeforeTest
public void setup() {
initialization();
util=new Utilities();
signin =new signInClass();

}
@Test
public void signindata1(){
signin.signindata();
}

@AfterTest
public void geardown() {
driver.quit();	
}
}