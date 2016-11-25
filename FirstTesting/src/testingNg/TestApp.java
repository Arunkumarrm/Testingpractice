package testingNg;
import org.testng.annotations.Test;

import testingcalc.*;

public class TestApp {
	
	@Test (priority=1) 
	public void test1(){
		login.log10();
		
	}
	
	@Test (priority=2)
    public void test2(){
    	Search.search();
    	}
	
	@Test (priority=3)
    public void test3(){
		Questionsearch.questionsearch();
	}
	
	@Test (priority=4)
	public void test4(){
		Questioncreate.questioncreate();
	}
	
	@Test (priority=5)
	public void test5(){
		Tagrelation.tagrelation();
	}
	@Test (priority=6)
	public void test6(){
		Tagcreation.tagcreation();
	}
	
}
