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
}
