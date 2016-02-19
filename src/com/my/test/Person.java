package com.my.test;
import java.lang.IllegalArgumentException;

public class Person {
    private  String name;
    public Person(String name) {
    	/*if(name==null || name.trim().equals("")) {
    		throw new IllegalArgumentException("Missing required name");
    	}
    	*/
    	
        this.name = name;
    }
    // This method can be altered by removing the throws and commenting-out the if or other changes like that
    // to test recompile of this class and others like Person2  and DeptInSrc2 (of src2)
    public String getName() throws IllegalArgumentException {
      
    	if(this.name==null || this.name.trim().equals("")) {
    		throw new IllegalArgumentException("Missing required name");
    	}
      
    	
        return this.name;
    }

 
}
