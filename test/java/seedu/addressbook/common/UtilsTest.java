package seedu.addressbook.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class UtilsTest {
	
	@Test 
	public void isAnyNull_allNull_returnTrue(){
	    Object[] testArray = new Object[]{null, null, null, null};
		Assert.assertTrue(Utils.isAnyNull(testArray));
	}
	
	@Test 
	public void isAnyNull_noNulls_returnFalse(){
	    Object[] testArray = new Object[]{new Object(), new Object()};
	    Assert.assertFalse(Utils.isAnyNull(testArray));
	}
	
	@Test 
	public void elementsAreUnique_singleElement_returnTrue(){
	    ArrayList<Object> testList = new ArrayList<>();
	    testList.add(1);
	    Assert.assertTrue(Utils.elementsAreUnique(testList));
	}
	
	@Test 
	public void elementsAreUnique_duplicateElements_returnFalse(){
	    Object object = new Object();
	    Object[] testArray = new Object[]{object, object};
	    List<Object> testList = Arrays.asList(testArray);
	    Assert.assertFalse(Utils.elementsAreUnique(testList));
	}
	
	@Test 
	public void elementsAreUnique_duplicateValuesDifferentObjects_returnFalse(){
	    Object[] testArray = new Object[]{new Integer(1), new Integer(1)};
	    List<Object> testList = Arrays.asList(testArray);
	    Assert.assertFalse(Utils.elementsAreUnique(testList));
	}
}
