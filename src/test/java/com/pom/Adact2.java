package com.pom;

import org.openqa.selenium.WebElement;

import com.base.Baseclass;

public class Adact2 extends Baseclass{
	
	
public static void main(String[] args) {
	
	browserLaunch();
	enterUrl("https://adactinhotelapp.com/");
	maxiWindow();
	
	Adact p1 = new Adact();
	p1.Adact("welcome", "Java123");
	
}
}
