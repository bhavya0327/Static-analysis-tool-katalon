package com.sample

import com.kms.katalon.core.annotation.Keyword
import java.util.ArrayList // Violation: Unused import

class MySampleKeyword {

	@Keyword
	def checkSomething(String text) {
		// Violation: Empty Catch Block
		try {
			println("Checking: " + text)
		} catch (Exception e) {
			// Should not be empty
		}
		
		// Violation: Unused Variable
		def x = 10
		
		return true
	}
	
	// Violation: Method name should be camelCase
	def Invalid_Method_Name() {
		return "Hello"
	}
}