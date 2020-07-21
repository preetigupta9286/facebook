package facebook.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import facebook.base.Facebook_BaseClass;

public class FBsignupClass extends Facebook_BaseClass {
	
@FindBy(name="firstname")
WebElement fn ;
	
@FindBy(name="lastname")
WebElement ln;

@FindBy(name="reg_email__")
WebElement email;

@FindBy(name="reg_email_confirmation__")
WebElement emailconfirmation;

@FindBy(name="reg_passwd__")
WebElement pwsd;

@FindBy(name="birthday_month")
WebElement month;

@FindBy(name="birthday_day")
WebElement day;
	
@FindBy(name="birthday_year")
WebElement year;

@FindBy(xpath="//input[@type='radio'and@name='sex'and @value='1']")
WebElement genderf;

@FindBy(xpath="//input[@type='radio'and@name='sex'and @value='2']")
WebElement genderm ;

@FindBy(xpath="//input[@type='radio'and@name='sex'and @value='2']")
WebElement customgender ;

@FindBy(name="websubmit")
WebElement submitbtgn;

//@FindBy(xpath="//button[@name='submit[__placeholder__]']")
//WebElement check;

//@FindBy(xpath="//div[@class='recaptcha-checkbox-border']")
//WebElement recaptcha;

//@FindBy()
//WebElement ;

//@FindBy()
//WebElement ;


 public FBsignupClass() {
 PageFactory.initElements(driver, this);
 }
 
 //actions
 
 public void signupdata() {
	 fn.sendKeys("prevek");	
	 ln.sendKeys("Gupta");
	 email.sendKeys("preetigupta1592@gmail.com");
	 emailconfirmation.sendKeys("preetigupta1592@gmail.com");
	 pwsd.sendKeys("2Innocent");
	 
	 Select select=new Select(month);
	 month.click();
	 select.selectByVisibleText("Jun");
	 
	 Select select1=new Select(day);
	 day.click();
	 select1.selectByVisibleText("15");
	 
	 Select select2=new Select(year);
	 year.click();
	 select2.selectByVisibleText("1992");
	 
	 genderf.click();
	 submitbtgn.click();
//	 check.click();
//	 recaptcha.click();
 }
	

}
