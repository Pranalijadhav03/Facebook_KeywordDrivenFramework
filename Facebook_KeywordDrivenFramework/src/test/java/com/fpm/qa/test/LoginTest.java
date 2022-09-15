package com.fpm.qa.test;

import org.testng.annotations.Test;

import com.fpm.qa.keyword.engine.KeywordEngine;

public class LoginTest {
 public KeywordEngine keywordEngine;
 
 @Test
 public void logintest() {
	 keywordEngine = new KeywordEngine();
	 keywordEngine.startExecution("login");
 }
}
