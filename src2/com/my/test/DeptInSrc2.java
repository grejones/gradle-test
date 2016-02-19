package com.my.test;

// add remove this and the reference in the constructor for testing of reference in another project (src)
import com.my.test.Person;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class DeptInSrc2 {
    private String name;
    private List<String> memberNames;
    public DeptInSrc2(String name) {
        this.name = name;
    }
    
    //TODO: comment-out this constructor and the import for Person to add/remove reference to src project
    public DeptInSrc2(String name, List<Person> members) {
    	this(name);
    	if(members!=null) {
    		this.memberNames=new ArrayList<String>();
    		for(int m=0;m<members.size();m++) {
    			this.memberNames.add(members.get(m).getName());
    		}
    	}
    }
    
    
//TODO: Add or remove the interface and inner class for testing removal of those by incremental compile
  interface PersonNameIterator { 
	  
	  public Iterator<String> getTheNameIterator();
  } 

  // Inner class implements the PersonNameIterator interface,
 
  public class DeptMemberNameIterator implements PersonNameIterator {
      
	  public Iterator<String> getTheNameIterator() {
		  Iterator<String> ret = null;
		  if(getMemberNames()!=null) {
			  ret = getMemberNames().iterator();
		  }
		  return ret;
	  }
  }

    
    
    
    

    public String getDeptName() {
        return name;
    }
    public List<String> getMemberNames() {
    	return this.memberNames;
    }

}
