package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;

public class Adact extends Baseclass{

	public Adact() {
	PageFactory.initElements(driver,this);
	}
@FindBy(id="username")		
		
		private WebElement txtusername;
@FindBy(id="password")
private WebElement txtpass;

@FindBy(id="login")
private WebElement btnlogin;

public WebElement getTxtusername() {
	return txtusername;
}

public WebElement getTxtpass() {
	return txtpass;
}

public WebElement getBtnlogin() {
	return btnlogin;
}

public void Adact(String username, String password) {

	WebElement txtuser= getTxtusername();
	txtuser.sendKeys(username);
	
	WebElement txtpass= getTxtpass();
	txtuser.sendKeys(password);
	
	WebElement btn= getBtnlogin();
	btn.click();
	
	
}
	
}
