/*My First Sample Program*/

package samplePackageFirst;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleFirstClass {
	
	@Test(dataProvider="data")
	public void testData(String a,String b){
		
		System.out.println(a+"----"+b);	
	}
	
	@DataProvider(name="data")
	public Object[][] dataDetails(){
		
		Object[][] obj=new Object[][]{{"Hello","World"}};
		return obj;
		
	}

}
