package facebook.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import facebook.base.Facebook_BaseClass;

public class signInClass extends Facebook_BaseClass {

	
@FindBy(name="email")
WebElement email;

@FindBy(name="pass")
WebElement pswd;


@FindBy(xpath="//input[@value='Log In']")
WebElement loginbtn;


public signInClass() {
PageFactory.initElements(driver, this);	
}

public void signindata() {
email.sendKeys(prop.getProperty("username"));
pswd.sendKeys(prop.getProperty("password"));
loginbtn.click();
}

}
