package seedu.addressbook.data.person;

public class Street {
	private String value;
	
	public Street(String streetString) {
		value = streetString;
	}
	
	@Override
	public String toString() {
		return value;
	}
}
