package facebook.pages.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import facebook.base.Facebook_BaseClass;
import facebook.pages.FBsignupClass;
import facebook.utilities.Utilities;

public class SignupTest extends Facebook_BaseClass{
	
Utilities util;
FBsignupClass sign;

public SignupTest() {
super();
}

@BeforeTest
public void setup() {
initialization();
util=new Utilities();
sign =new FBsignupClass();
}

@Test
public void signupdata1() {
sign.signupdata();	
}

}
