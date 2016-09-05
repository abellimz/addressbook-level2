package seedu.addressbook.data.person;

import org.junit.Assert;
import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;

public class NameTester {
	
	@Test
	public void isSimilar_similarNames_returnTrue() throws IllegalValueException{
		Name nameA = new Name("Abel Lim Jun Hong");
		Name nameB = new Name("AbelLimJunHong");
		Assert.assertTrue(nameA.isSimilar(nameB));
	}
	
	@Test
	public void isSimilar_differentNames_returnFalse() throws IllegalValueException{
		Name nameA = new Name("Adam Lum Jing Tong");
		Name nameB = new Name("AbelLimJunHong");
		Assert.assertFalse(nameA.isSimilar(nameB));
	}
	
	@Test
	public void isSimilar_subsetName_returnFalse() throws IllegalValueException{
		Name nameA = new Name("Abel Lim Jun Hong");
		Name nameB = new Name("Abel Lim");
		Assert.assertFalse(nameA.isSimilar(nameB));
	}
}
